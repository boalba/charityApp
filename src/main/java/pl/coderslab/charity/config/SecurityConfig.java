package pl.coderslab.charity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import pl.coderslab.charity.authenticationSuccessHandler.SimpleAuthenticationSuccessHandler;
import pl.coderslab.charity.user.CharityUserDetailsService;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(customUserDetailsService())
                .passwordEncoder(passwordEncoder());    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                .antMatchers("/api/login").permitAll()
                .antMatchers("/api/register").permitAll()
                .antMatchers("/api/").permitAll()
                .antMatchers("/api/admin", "/api/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and().csrf().disable()
                .formLogin()
                .successHandler(successHandler())
                .loginPage("/api/login")
                .usernameParameter("email")
                .passwordParameter("password")
                .failureUrl("/api/login")
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/api/logout"))
                .logoutSuccessUrl("/api/login").and().exceptionHandling()
                .accessDeniedPage("/api/login");
        ;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    public CharityUserDetailsService customUserDetailsService() {
        return new CharityUserDetailsService();
    }

    @Bean
    public SimpleAuthenticationSuccessHandler successHandler(){
        return new SimpleAuthenticationSuccessHandler();
    }

}

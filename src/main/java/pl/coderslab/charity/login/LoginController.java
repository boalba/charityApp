package pl.coderslab.charity.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api")
public class LoginController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}

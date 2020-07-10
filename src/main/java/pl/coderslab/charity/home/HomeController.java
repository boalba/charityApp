package pl.coderslab.charity.home;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.institution.InstitutionService;


@Controller
@AllArgsConstructor
@Slf4j
public class HomeController {

    private InstitutionService institutionService;

    @RequestMapping("/")
    public String homeAction(Model model){
        log.debug("Hello World");
        log.info("2+2={}",4);
        model.addAttribute("listOfAllInstitutions", institutionService.findAllInstitutions());
        return "index";
    }
}

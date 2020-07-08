package pl.coderslab.charity.home;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.institution.InstitutionService;


@Controller
@AllArgsConstructor
public class HomeController {

    private InstitutionService institutionService;

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("listOfAllInstitutions", institutionService.findAllInstitutions());
        return "index";
    }
}

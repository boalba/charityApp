package pl.coderslab.charity.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class AdminController {

    private final InstitutionService institutionService;

    @GetMapping("/admin")
    public String admin(){

        return "admin";
    }
}

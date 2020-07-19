package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.category.CategoryService;
import pl.coderslab.charity.institution.InstitutionService;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    @GetMapping("/donation")
    public String donationAddForm(Model model){
        model.addAttribute("donation", new Donation());
        model.addAttribute("listOfAllCategories", categoryService.allCategories());
        model.addAttribute("listOfAllInstitutions", institutionService.allInstitutions());
        return "form";
    }

    @PostMapping("/form-confirmation")
    public String processDonationAddForm(Donation donation){
        donationService.saveDonation(donation);
        return "form-confirmation";
    }
}

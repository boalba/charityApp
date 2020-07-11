package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.category.CategoryService;
import pl.coderslab.charity.institution.InstitutionService;

@Controller
@RequiredArgsConstructor
@Slf4j

public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    @RequestMapping(value = "/donation", method = RequestMethod.GET)
    public String donationAddForm(Model model){
        model.addAttribute("donation", new Donation());
        model.addAttribute("listOfAllCategories", categoryService.allCategories());
        model.addAttribute("listOfAllInstitutions", institutionService.allInstitutions());
        return "form";
    }

    @RequestMapping(value="/form-confirmation", method = RequestMethod.POST)
    public String processDonationAddForm(@ModelAttribute(name = "donation") Donation donation){
        donationService.saveDonation(donation);
        return "form-confirmation";
    }
}

package pl.coderslab.charity.home;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.donation.DonationService;
import pl.coderslab.charity.institution.InstitutionService;


@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationService donationService;

    @RequestMapping("/")
    public String homeAction(Model model){
        log.debug("Hello World");
        log.info("2+2={}",4);
        model.addAttribute("listOfAllInstitutions", institutionService.allInstitutions());
        model.addAttribute("numberOfAllDonatedBags",donationService.numberOfDonatedBags());
        model.addAttribute("numberOfDonations", donationService.numberOfDonations());
        return "index";
    }
}

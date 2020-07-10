package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
@Slf4j

public class DonationController {

    @RequestMapping(value = "/donation", method = RequestMethod.GET)
    public String donationAddForm(){

        return "form";
    }

    @RequestMapping(value="/donation", method = RequestMethod.POST)
    public String processDonationAddForm(){
        return "redirect:/";
    }
}

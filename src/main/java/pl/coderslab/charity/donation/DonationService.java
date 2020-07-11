package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;

    public List<Donation> allDonations(){
        return donationRepository.findAll();
    }

    public int numberOfDonatedBags(){
        List<Donation> listOfAllDonations = this.allDonations();
        int sum = 0;
        for(Donation donation : listOfAllDonations){
            sum += donation.getQuantity();
        }
        return sum;
    }

    public int numberOfDonations(){
        List<Donation> allDonations = this.allDonations();
        int sum = 0;
        for(Donation donation : allDonations){
            sum += 1;
        }
        return sum;
    }

    public void saveDonation(Donation donation){
        donationRepository.save(donation);
    }
}

package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class DonationService {

    private final DonationRepository donationRepository;

    public List<Donation> allDonations(){
        return donationRepository.findAll();
    }

    public long numberOfDonatedBags(){
        return donationRepository.numberOfDonatedBags();
    }

    public long numberOfDonations(){
       return donationRepository.count();
    }

    public void saveDonation(Donation donation){
        log.debug("Zapisywana darowizna:{}",donation);
        donationRepository.save(donation);
        log.debug("Zapisana darowizna:{}",donation);
    }
}

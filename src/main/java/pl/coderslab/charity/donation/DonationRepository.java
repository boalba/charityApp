package pl.coderslab.charity.donation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface DonationRepository  extends JpaRepository<Donation, Long> {

    @Query(value = "SELECT COUNT (id) FROM donation", nativeQuery = true)
    long numberOfDonatedBags();
}

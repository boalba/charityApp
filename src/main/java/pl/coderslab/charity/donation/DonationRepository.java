package pl.coderslab.charity.donation;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface DonationRepository  extends JpaRepository<Donation, Long> {
}

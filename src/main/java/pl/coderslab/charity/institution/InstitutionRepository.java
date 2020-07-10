package pl.coderslab.charity.institution;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface InstitutionRepository extends JpaRepository<Institution, Long> {

}

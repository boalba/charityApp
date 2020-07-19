package pl.coderslab.charity.institution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface InstitutionRepository extends JpaRepository<Institution, Long> {

    @Query(value = "SELECT * FROM institution WHERE id = ?1", nativeQuery = true)
    Optional<Institution> findInstitutionById(Long id);

    @Query(value = "DELETE FROM institution WHERE id = ?1", nativeQuery = true)
    void deleteInstitutionById(Long id);


}

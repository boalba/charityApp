package pl.coderslab.charity.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class InstitutionService {

    private final InstitutionRepository institutionRepository;

    public List<Institution> allInstitutions(){
        return institutionRepository.findAll();
    }

    public void saveInstitution(Institution institution){
        institutionRepository.save(institution);
    }

    public Optional<Institution> findInstitutionById(Long id){
        return institutionRepository.findInstitutionById(id);
    }

    public void deleteInstitutionById(Long id){
        institutionRepository.deleteInstitutionById(id);
    }
}

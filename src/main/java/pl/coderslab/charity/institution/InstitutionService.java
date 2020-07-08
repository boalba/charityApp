package pl.coderslab.charity.institution;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class InstitutionService {

    private InstitutionRepository institutionRepository;

    public List<Institution> findAllInstitutions(){
        return institutionRepository.findAll();
    }
}

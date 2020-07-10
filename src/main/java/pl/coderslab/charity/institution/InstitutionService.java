package pl.coderslab.charity.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class InstitutionService {

    private final InstitutionRepository institutionRepository;

    public List<Institution> findAllInstitutions(){
        return institutionRepository.findAll();
    }
}

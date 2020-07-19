package pl.coderslab.charity.institution;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/institution")
@RequiredArgsConstructor
public class InstitutionController {

    private final InstitutionService institutionService;

    @GetMapping("/")
    public List<Institution> getAllInstitutions(){
        return institutionService.allInstitutions();
    }

    @PostMapping("/")
    public Institution createNewInstitution(Institution institution){
        institutionService.saveInstitution(institution);
        return institution;
    }

    @GetMapping("/{id}")
    public Institution getInstitutionById(@PathVariable Long id){
        Optional<Institution> institution = institutionService.findInstitutionById(id);
        return institution.get();
    }

    @PutMapping("/{id}")
    public Institution changeInstitution(Institution institution){
        institutionService.saveInstitution(institution);
        return institution;
    }

    @DeleteMapping("/{id}")
    public void deleteInstitutionById(@PathVariable Long id){
        institutionService.deleteInstitutionById(id);
    }
}

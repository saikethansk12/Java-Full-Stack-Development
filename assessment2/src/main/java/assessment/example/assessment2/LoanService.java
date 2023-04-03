package assessment.example.assessment2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public class LoanService<LoanService> {

    @Autowired
    private LoanService loanService;

    @PutMapping("/status")
    public void callStatus() {
        loanService.implementUpdate();
    }
}
package assessment.example.assessment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Modifying
    @Transactional
    @Query("update PersonalLoan set statusOfApproval='yes' where cibil>700 and profession in ('salaried','self-employed') and incomePerAnnum >= requestedAmount*3")
    void updateStatus();

    @Autowired
    public class LoanRepository<LoanRepository> {
    private LoanRepository loanRepository;

        public LoanRepository(LoanRepository loanRepository) {
            this.loanRepository = loanRepository;
        }

        public void implementUpdate(){
        loanRepository.updateStatus();
    }
    }
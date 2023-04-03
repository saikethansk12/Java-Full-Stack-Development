package assessment.example.assessment2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.TemporalType;
import java.util.Date;

@NoArgsConstructor
@Data
@AllArgsConstructor


@Entity
public class PersonalLoan {
    @Id
    @Column(nullable = false)
    private int loanRequestNumber;
    @Column(nullable = false)
    private int  requestedAmount;
    @Column(nullable = false)
    private int cibil;
    @Column(nullable = false)
    private long aadhaar;
    @Column(nullable = false)
    private String pan;
    @Column(nullable = false)
    private String profession;
    @Column(nullable = false)
    private int incomePerAnnum;
    @Column(nullable = false)
    private String statusOfApproval;
    @Temporal(TemporalType.DATE)
    private Date dateOfTheRequest;

}

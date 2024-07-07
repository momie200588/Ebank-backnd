package entities;

import enums.AccountStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
 @Id
   private String id; //RIB
    private double balance;
    private Date creaAt;
    private AccountStatus status;
    @ManyToOne
    private  Customer customer;

    private List<AccountOpperation> accountOpperations;




}

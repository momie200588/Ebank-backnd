package entities;

import enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor
@NoArgsConstructor


public class AccountOpperation {

    private  Long Id;
    private Date opretationDate;
    private double ammount;
    private OperationType operationType;

    private BankAccount bankAccount;

}

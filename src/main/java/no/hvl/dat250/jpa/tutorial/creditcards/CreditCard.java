package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private Integer number;
    @Getter
    @Setter
    private Integer creditLimit;
    @Getter
    @Setter
    private Integer balance;
    @ManyToOne
    @Getter
    @Setter
    private Pincode pincode;
    @ManyToOne
    private Bank bank;


    public Bank getOwningBank() {
        return bank;
    }
    public void setOwningBank(Bank bank){
        this.bank = bank;
    }
}

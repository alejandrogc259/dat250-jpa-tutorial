package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "bank")
    private Set<CreditCard> cards = new HashSet<>();
    @Getter
    @Setter
    private String name;

    public Long getId() {
        return id;
    }

    public Collection<CreditCard> getOwnedCards() {
        return cards;
    }
}

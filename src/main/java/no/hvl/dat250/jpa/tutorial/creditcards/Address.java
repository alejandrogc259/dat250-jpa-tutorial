package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.*;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private String street;
    @Getter
    @Setter
    private Integer number;
    @ManyToMany(mappedBy = "addresses")
    private Set<Customer> customers = new HashSet<>();

    public Collection<Customer> getOwners() {
        return customers;
    }
}

package model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customername")
    private String customerName;

    public Customer(Long id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }
}

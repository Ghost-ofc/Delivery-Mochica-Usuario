package org.mochica.AppDelivery.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long Id;
    String name;
    String email;
    String password;
    Long phone;
    String address;
    Long dni;
    String reference;

    public User(Long id, String name, String email, String password, Long phone, String address, Long dni, String reference) {
        Id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.dni = dni;
        this.reference = reference;
    }

}

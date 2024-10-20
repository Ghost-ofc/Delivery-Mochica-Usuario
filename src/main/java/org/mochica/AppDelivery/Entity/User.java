package org.mochica.AppDelivery.Entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Data
public class User {


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

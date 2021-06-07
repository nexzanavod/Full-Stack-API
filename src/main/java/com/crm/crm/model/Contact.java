package com.crm.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity



public class Contact {

    private @Id @GeneratedValue Long id;

    private String fisrtName;
    private String lastName;
    private String email;

    private Contact () {}

    public Contact(String firstName, String lastName, String email) {
        this.fisrtName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

}

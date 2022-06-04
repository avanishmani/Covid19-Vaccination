package com.covid.vaccination.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer address_id;
    private String city;
    private String state;
    private String pinCode;

   @OneToOne(mappedBy = "address")
   @JsonBackReference
    private User user;
}

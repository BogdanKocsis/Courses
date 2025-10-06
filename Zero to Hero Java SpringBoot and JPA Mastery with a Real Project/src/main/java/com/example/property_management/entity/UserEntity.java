package com.example.property_management.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ownerName;
    @Column(name = "EMAIL", nullable = false) // If we did not give this then ownerEmail name column will be  created
    private String ownerEmail;
    private String phone;
    @Column(name = "PASSWORD", nullable = false)
    private String password;

}

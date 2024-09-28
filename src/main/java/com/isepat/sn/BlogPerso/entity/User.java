package com.isepat.sn.BlogPerso.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Lombok génère les getters et setters
@NoArgsConstructor // Génère un constructeur sans arguments
@AllArgsConstructor // Génère un constructeur avec tous les arguments
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(unique = true) // Assurez-vous que le nom d'utilisateur est unique
    private String username;

    @Column(unique = true) // Assurez-vous que l'email est unique
    private String email;

    private String password;

    // Getters and Setters
}
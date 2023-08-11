package br.com.matheusfabiao.nutrieasyapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Represents a user entity in the NutriEasy API.
 * This class is annotated as an entity for database mapping.
 * Uses Lombok annotations for getter, setter, and constructor generation.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {

    /**
     * The unique identifier for the user.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The full name of the user.
     */
    private String name;

    /**
     * The email address of the user.
     */
    private String email;

    /**
     * The password associated with the user.
     */
    private String password;

    /**
     * The timestamp indicating when the user was created.
     */
    private LocalDateTime createdAt;

}

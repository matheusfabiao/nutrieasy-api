package br.com.matheusfabiao.nutrieasyapi.dto;

import br.com.matheusfabiao.nutrieasyapi.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Data Transfer Object (DTO) representing a minimal version of the User entity.
 * This DTO is used to efficiently transfer user data between layers of the application.
 */
@Getter
@NoArgsConstructor
public class UserMinDTO {

    /**
     * The unique identifier for the user.
     */
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
     * The timestamp indicating when the user was created.
     */
    private LocalDateTime createdAt;

    /**
     * Constructs a UserMinDTO object based on the provided User entity.
     *
     * @param entity The User entity from which to construct the DTO.
     */
    public UserMinDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        createdAt = entity.getCreatedAt();
    }

}

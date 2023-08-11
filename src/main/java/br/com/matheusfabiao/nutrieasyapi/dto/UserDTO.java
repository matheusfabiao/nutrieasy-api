package br.com.matheusfabiao.nutrieasyapi.dto;

import br.com.matheusfabiao.nutrieasyapi.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

/**
 * Data Transfer Object (DTO) representing a complete version of the User entity.
 * This DTO is used to efficiently transfer user data between layers of the application.
 */
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

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
     * The password associated with the user.
     */
    private String password;

    /**
     * The timestamp indicating when the user was created.
     */
    private LocalDateTime createdAt;

    /**
     * Constructs a UserDTO object based on the provided User entity.
     *
     * @param entity The User entity from which to construct the DTO.
     */
    public UserDTO(User entity) {
        BeanUtils.copyProperties(entity, this);
    }
}

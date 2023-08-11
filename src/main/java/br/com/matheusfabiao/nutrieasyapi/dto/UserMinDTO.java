package br.com.matheusfabiao.nutrieasyapi.dto;

import br.com.matheusfabiao.nutrieasyapi.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UserMinDTO {

    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;

    public UserMinDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        createdAt = entity.getCreatedAt();
    }

}

package br.com.matheusfabiao.nutrieasyapi.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class User {

    private String name;
    private String email;
    private String password;
}

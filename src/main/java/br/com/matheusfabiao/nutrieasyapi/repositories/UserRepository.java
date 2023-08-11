package br.com.matheusfabiao.nutrieasyapi.repositories;

import br.com.matheusfabiao.nutrieasyapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
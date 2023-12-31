package io.github.SrMazinho.ProjetoBack.Querrys;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAgeGreaterThan(int age);

    List<User> findByFirstNameIgnoreCase(String firstName);

}

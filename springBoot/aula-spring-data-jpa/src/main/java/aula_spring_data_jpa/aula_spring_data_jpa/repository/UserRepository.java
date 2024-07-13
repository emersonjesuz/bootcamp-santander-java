package aula_spring_data_jpa.aula_spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aula_spring_data_jpa.aula_spring_data_jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
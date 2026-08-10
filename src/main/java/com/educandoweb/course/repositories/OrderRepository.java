package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

    // JPARepository ja faz as implementações pra gente. Nem precisamos declarar nada

}

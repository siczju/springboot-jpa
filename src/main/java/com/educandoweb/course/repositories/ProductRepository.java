package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // JPARepository ja faz as implementações pra gente. Nem precisamos declarar nada

}

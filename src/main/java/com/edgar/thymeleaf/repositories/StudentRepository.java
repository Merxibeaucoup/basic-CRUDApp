package com.edgar.thymeleaf.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edgar.thymeleaf.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{

}

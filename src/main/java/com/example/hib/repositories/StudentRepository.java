package com.example.hib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hib.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}

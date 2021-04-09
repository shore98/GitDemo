package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
/*A repository extended from JpaRepositoryfor students
 * is created providing the type of entity and primary key */
}

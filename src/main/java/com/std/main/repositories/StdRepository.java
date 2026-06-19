package com.std.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.std.main.entities.Student;

@Repository
public interface StdRepository extends JpaRepository<Student, Integer>
{

}

package com.student.page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.page.model.Student;

public interface Studentrepository extends JpaRepository<Student, Long> {

}

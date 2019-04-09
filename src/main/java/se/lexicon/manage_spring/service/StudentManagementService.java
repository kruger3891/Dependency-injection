package se.lexicon.manage_spring.service;

import java.util.List;

import se.lexicon.manage_spring.models.Student;

public interface StudentManagementService {

	Student create();

	Student save(Student s);

	Student find(int id);

	Student delit(int id);

	List<Student> findAll();

}
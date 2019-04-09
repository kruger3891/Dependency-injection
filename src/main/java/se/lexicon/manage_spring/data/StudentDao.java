package se.lexicon.manage_spring.data;

import java.util.List;

import se.lexicon.manage_spring.models.Student;

public interface StudentDao {

	Student save(Student s);

	Student find(int id);

	List<Student> findAll();

	void delete(int id);

}
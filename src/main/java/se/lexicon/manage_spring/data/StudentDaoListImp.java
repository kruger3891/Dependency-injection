package se.lexicon.manage_spring.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import se.lexicon.manage_spring.models.Student;

@Component
public class StudentDaoListImp implements StudentDao {
	
	private List<Student> students = new ArrayList<>();
	
	@Override
	public Student save (Student s) {
		students.add(s);
		return s;
	}
	
	@Override
	public Student find(int id){
		Optional<Student> re = students.stream().filter(s->s.getId()==id).findFirst();
		
		if (re.isPresent()) {
			return re.get();
		}
		return null;
	}
	
	@Override
	public List<Student> findAll(){
		return students;
	}
	
	@Override
	public void delete(int id) {
		students = students.stream().filter(s->s.getId()!=id).collect(Collectors.toList());
	}
}

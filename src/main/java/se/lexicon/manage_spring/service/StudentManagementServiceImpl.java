package se.lexicon.manage_spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.lexicon.manage_spring.data.StudentDao;
import se.lexicon.manage_spring.models.Student;


@Service
public class StudentManagementServiceImpl implements StudentManagementService {
	
	private StudentDao stDao;

	@Autowired
	public StudentManagementServiceImpl(StudentDao studentDaoListImp) {
		this.stDao = studentDaoListImp;
	}

	@Override
	public Student create() {
		System.out.print("Name: ");
		return stDao.save(new Student(null, null, null, null));
		
	}
	
	@Override
	public Student save(Student s) {
		return stDao.save(s);
		
	}
	@Override
	public Student find(int id) {
		return stDao.find(id);
		
	}
	@Override
	public Student delit(int id) {
		Student re = stDao.find(id);
		stDao.delete(id);
		return re;
		
	}
	@Override
	public List<Student> findAll() {
		return stDao.findAll();
		
	}

}

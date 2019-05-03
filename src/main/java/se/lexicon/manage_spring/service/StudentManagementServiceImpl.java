package se.lexicon.manage_spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.lexicon.manage_spring.data.StudentDao;
import se.lexicon.manage_spring.models.Student;
import se.lexicon.manage_spring.util.UserInputService;


@Service
public class StudentManagementServiceImpl implements StudentManagementService {
	
	private StudentDao stDao;

	private UserInputService sc;
	
	@Autowired
	public StudentManagementServiceImpl(StudentDao studentDaoListImp) {
		this.stDao = studentDaoListImp;
	}

	@Override
	public Student create() {
		System.out.print("Name: ");
		return stDao.save(new Student(sc.getString(), sc.getString(), sc.getString(), sc.getString()));
		
	}
	
	@Override
	public Student save(Student s) {
		return stDao.save(s);
		
	}
	@Override
	public Student find(int id) {
		return stDao.find(sc.getInt());
		
	}
	@Override
	public Student delit(int id) {
		Student re = stDao.find(sc.getInt());
		stDao.delete(id);
		return re;
		
	}
	@Override
	public List<Student> findAll() {
		return stDao.findAll();
		
	}

}

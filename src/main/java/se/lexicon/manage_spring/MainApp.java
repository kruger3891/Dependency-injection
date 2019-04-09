package se.lexicon.manage_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lexicon.manage_spring.models.Student;
import se.lexicon.manage_spring.service.StudentManagementService;

public class MainApp {
    public static void main( String[] args ){
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SMConfig.class);

    	StudentManagementService sM = context.getBean(StudentManagementService.class);
    	
    	sM.save(new Student("Gnaeus", "Fundanus", "gnaus@gmail.com", "0750987654"));
    	sM.save(new Student("Lars", "Calpurnius", "lars@gmail.com", "0987654234"));
    	sM.save(new Student("Caius", "Claudius", "cars@gmail.com", "0354212345"));

    	sM.findAll().forEach(System.out::println);
    	context.close();
    }
}


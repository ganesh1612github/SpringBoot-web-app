package in.nareshit.ganesh.service;

import java.util.List;

import in.nareshit.ganesh.entity.Student;

public interface IStudentService {

	Integer saveStudent(Student student);
	
	List<Student> getALLStudent();
	
	void deleteStudentById(Integer Id);
	
    
}

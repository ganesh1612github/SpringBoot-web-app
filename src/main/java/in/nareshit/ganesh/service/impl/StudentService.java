package in.nareshit.ganesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.ganesh.entity.Student;
import in.nareshit.ganesh.repo.StudentRepository;
import in.nareshit.ganesh.service.IStudentService;

@Service
public class StudentService implements IStudentService{

	@Autowired
	private StudentRepository repo; //has-a relation

	@Override
	public Integer saveStudent(Student student) {
		Student stu = repo.save(student);
		return stu.getStuId();
	}

	@Override
	public List<Student> getALLStudent() {
		List<Student> list = repo.findAll();
		return list;
	}

	@Override
	public void deleteStudentById(Integer Id) {
        repo.deleteById(Id);
	}
}

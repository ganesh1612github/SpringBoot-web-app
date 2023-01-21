package in.nareshit.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.ganesh.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}

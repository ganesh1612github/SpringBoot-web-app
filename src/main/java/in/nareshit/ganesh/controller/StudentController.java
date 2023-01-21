package in.nareshit.ganesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.nareshit.ganesh.entity.Student;
import in.nareshit.ganesh.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private IStudentService service;//has-a
	

	@GetMapping("/register")
	public String showRegister() {
		return "StudentDetail";
	}
	
	@PostMapping("/save")
	public String saveStudent1(@ModelAttribute Student student1,Model model) {
		
		Integer id = service.saveStudent(student1);
		String message="message '"+id+"' created";
		model.addAttribute("message", message);
		return "StudentDetail";
	}
	
	@GetMapping("/all")
	public String viewAllStudent(Model mode1) 
	{    
		 List<Student> list = service.getALLStudent();
	     mode1.addAttribute("list", list);
				return "StudentData2";	
	}
	
	@GetMapping("/delete")
	public String deleteStudentById(
		@RequestParam Integer id,
		Model model ) 
	{    
		//call service 
		service.deleteStudentById(id);
		//get success message
		String message="Student '"+id+"' deleted";
		model.addAttribute("message", message);
		
		//get latest data
		List<Student> list = service.getALLStudent();
	    model.addAttribute("list", list);
		return "StudentData2";
	}
}

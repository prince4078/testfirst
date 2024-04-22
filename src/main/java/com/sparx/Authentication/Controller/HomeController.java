package com.sparx.Authentication.Controller;

import com.sparx.Authentication.Entity.Student;
import com.sparx.Authentication.Entity.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	StudentRepository studentRepository;
	@GetMapping("/user")
	public String home() {
		return "home sucess";
	}
	@PostMapping("/search")
	public List<Student> getAllStuent(@RequestParam(value="search",defaultValue = "") String search,
									  @RequestParam(value="batch",defaultValue = "null" ) String batch,
									  @RequestParam(value="state",defaultValue = "null") String state){
		List<Student> slist = studentRepository.searchByNameAndBatchAndState(search, batch, state);
		return slist;
		//return null;
	}
    @PostMapping("/all")
	public List<Student> getStudents(){
		List<Student> studentList=studentRepository.findAll();
		return studentList;
	}


}

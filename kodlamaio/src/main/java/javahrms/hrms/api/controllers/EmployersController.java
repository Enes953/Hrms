package javahrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javahrms.hrms.business.abstracts.EmployerService;
import javahrms.hrms.core.utilites.results.DataResult;
import javahrms.hrms.core.utilites.results.Result;
import javahrms.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}

	@GetMapping("/getall")
	public DataResult<List<Employer>>getAll(){
		
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
		
	}
}

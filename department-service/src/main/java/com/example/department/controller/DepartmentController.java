package com.example.department.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return deptService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		return deptService.findDepartmentById(departmentId);
		
	}
	//adding method get department Code
	@GetMapping("/{id}")
	public Department findDepartmentCode(@PathVariable("id") Long departmentId) {
		return deptService.findDepartmentCode(departmentId);
		
	}
	
	//adding method to get department address
	@GetMapping("/{id}")
	public Department findDepartmentAddress(@PathVariable("id") Long departmentId) {
		return deptService.findDepartmentAddress(departmentId);
	}
	
}
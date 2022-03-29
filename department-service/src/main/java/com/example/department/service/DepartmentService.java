package com.example.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		
		return departmentRepository.findByDepartmentId(departmentId);
	}

	public Department findDepartmentCode(Long departmentId) {
		Department department=new Department();
		
		List<Department> departmentList= departmentRepository.findByDepartmentCode(departmentId);
		for (Department department2 : departmentList) {
			department.setDepartmentCode(department2.getDepartmentCode());	
			
		}
		return department;
	}
	
	public Department findDepartmentAddress(Long departmentId) {
		Department department=new Department();
		List<Department> dlist= departmentRepository.findByDepartmentAddress(departmentId);
		for (Department department3 : dlist) {
			department.setDepartmentAddress(department3.getDepartmentAddress());
			
		}
		return department;
	}

}

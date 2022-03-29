package com.example.department.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department findByDepartmentId(Long departmentId);

	List<Department> findByDepartmentCode(Long departmentId);
	
	List<Department> findByDepartmentAddress(Long departmentId);

}

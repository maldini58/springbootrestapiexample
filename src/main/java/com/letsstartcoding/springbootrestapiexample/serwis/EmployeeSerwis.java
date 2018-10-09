package com.letsstartcoding.springbootrestapiexample.serwis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Employee;
import com.letsstartcoding.springbootrestapiexample.repository.EmployeeRepository;


@Service
public class EmployeeSerwis {
	
	
	EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeSerwis(EmployeeRepository employeeRepository){
		this.employeeRepository=employeeRepository;
	}
	
	/* to save an employee */
	
	public Employee save(Employee emp) {
		if(emp!=null) {
			return employeeRepository.save(emp);
		}
		else {
			throw new NullPointerException("Nieudana próba usuniêcia. Podany pracownik nie istnieje");
		}
	}
	
	/* search all employee */
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	/* get an employee by id */
	
	public Employee findOne(Long empid) {
		if(empid!=null) {
			return employeeRepository.findOne(empid);
		}
		else {
			throw new NullPointerException("Nieudana próba usuniêcia. Podany pracownik nie istnieje");
		}
	}
	
	/* delete an employee */
	
	public void delete(Employee emp){
		if(emp!=null) {
			employeeRepository.delete(emp);
		}
		else {
			throw new NullPointerException("Nieudana próba usuniêcia. Podany pracownik nie istnieje");
		}
	}

}
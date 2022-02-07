package com.edgar.thymeleaf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.edgar.thymeleaf.models.Student;
import com.edgar.thymeleaf.repositories.StudentRepository;

@Service
public class StudentServices {

	@Autowired
	private StudentRepository sRep;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Student> getAll() {
		String sql = "select * from student";

		List<Student> listStudent = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
		return listStudent;

	}
	
	
	public Optional<Student> getOne(Integer id) {
		return sRep.findById(id);
		
	}
	
	public void addNew(Student student) {
		sRep.save(student);
	}
	


	public void update(Student student ) {
		sRep.save(student);
	}
	
	public void delete(Integer id) {
		sRep.deleteById(id);
		
	}
	
}

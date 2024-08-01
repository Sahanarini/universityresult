package com.ani.restapp.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ani.restapp.model.Student;
import com.ani.restapp.repository.StudentRepo;
import com.ani.restapp.service.StudentService;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

	
//	@Autowired
//	StudentHibImp rep;
	
	StudentRepo repo;

	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addStudent(Student student) {
		if(student!=null)
		{
			repo.save(student);
			return "success";
		}
		else {
			return "failure";
		}
			}

	@Override
	public Student getStudent(int id) {
		Optional<Student> studentOptional=repo.findById(id);
		return studentOptional.orElse(null);
	}

	public List<Student> getAllStudents() {

		return repo.findAll();
	}

	@Override
	public String updateStudent(Student student) {
		if(student!=null)
		{
			repo.save(student);
			return "success";
		}
		else {
			return "failure";
		}

	}

	@Override
	public String deleteStudent(int id) {
		Optional<Student> studentOptional= repo.findById(id);
		if(studentOptional.isPresent())
		{
			repo.deleteById(id);
			return "success";
		}
		else {
			return "failure";
		}
	}

}

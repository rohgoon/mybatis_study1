package kr.co.dgit.school.dao;

import java.util.List;

import kr.co.dgit.school.dto.Student;

public interface StudentDao {
	void insertItem(Student item);
	void deleteItem(int idx);
	void updateItem(Student item);
	Student selectByNo(int idx);
	List<Student> selectByAll();
	
}

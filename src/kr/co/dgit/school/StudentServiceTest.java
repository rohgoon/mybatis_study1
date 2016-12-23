package kr.co.dgit.school;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.co.dgit.school.dto.Student;
import kr.co.dgit.school.service.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	/*@Test
	public void testSelectByAll() {
		List<Student> list = studentService.findAllStudent();
		Assert.assertNotNull(list);
	}
	@Test
	public void testSelectByNo() {
		Student std = studentService.selectByNo(1);
		Assert.assertNotNull(std);
	}
	
	@Test
	public void testInsertItem() {
		Calendar cal = Calendar.getInstance();
		cal.set(2000, 01, 01);
		Student insStd = new Student(4, "강보미2", "kbm2@test.co.kr", cal.getTime()); 
		studentService.insertItem(insStd);
		
		List<Student> list = studentService.findAllStudent();
		
		Assert.assertEquals(4, list.size());
	}*/
	
	/*@Test
	public void testDeleteItem() { 
		studentService.deleteItem(2);
		
		Student std = studentService.selectByNo(2);
		
		Assert.assertNull(std);
	}*/
	@Test
	public void testUpdateItem() {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(2000, 01, 01);
		Student upStd = new Student(4, "이유진", "lyj@test.co.kr", cal.getTime()); 
		studentService.updateItem(upStd);
		
		Student std = studentService.selectByNo(4);
		Assert.assertEquals(std, upStd);
	}
}

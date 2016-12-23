package kr.co.dgit.school.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.co.dgit.school.dao.StudentDao;
import kr.co.dgit.school.dto.Student;
import kr.co.dgit.school.util.MyBatisSqlSessionFactory;

public class StudentService {
	private static final StudentService instance = new StudentService();

	public static StudentService getInstance() {
		return instance;
	}
	
	private StudentService(){}
	
	private static final Logger logger = Logger.getLogger(StudentService.class);
	
	public List<Student> findAllStudent(){
		logger.debug("selectByAll()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao =sqlSession.getMapper(StudentDao.class);
		try {
			return studentDao.selectByAll();
		} finally {
			sqlSession.close();
		}
		
		
	}
	public Student selectByNo(int studId){
		logger.debug("selectByNo()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao =sqlSession.getMapper(StudentDao.class);
		try {
			return studentDao.selectByNo(studId);
		} finally {
			sqlSession.close();
		}
		
	}
	
	public void insertItem(Student std){
		logger.debug("insertItem()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao =sqlSession.getMapper(StudentDao.class);
		try {
			studentDao.insertItem(std);
			sqlSession.commit(); // commit()을 해줘야 실제 데이터가 삽입이 된다.
		} finally {
			sqlSession.close();
		}
		
	}
	
	public void deleteItem(int idx){
		logger.debug("selectByNo()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao =sqlSession.getMapper(StudentDao.class);
		try {
			studentDao.deleteItem(idx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		
	}
	
	public void updateItem(Student std){
		logger.debug("updateItem()");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		StudentDao studentDao =sqlSession.getMapper(StudentDao.class);
		try {
			studentDao.updateItem(std);
			sqlSession.commit(); // commit()을 해줘야 실제 데이터가 삽입이 된다.
		} finally {
			sqlSession.close();
		}
		
	}
}

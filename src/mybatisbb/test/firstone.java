package mybatisbb.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hzh.util.util;
import com.mysql.jdbc.Util;

import mybatisbb.ben.Test;
import mybatisbb.ben.department;
import mybatisbb.dao.depamapper;
import mybatisbb.dao.mybatisInterface;


public class firstone {
	public static void main(String[] args) throws FileNotFoundException {
		/*FileInputStream fi=new FileInputStream("src/mybatis.xml");
		//System.out.println(fi);
		SqlSessionFactory  sql= new SqlSessionFactoryBuilder().build(fi);
		//System.out.println(sql);
		SqlSession openSession = sql.openSession();*/
		/*util sql=new util();
		//静态实列化 不会自动提交
		SqlSession openSession = sql.getsql().openSession();
		try {
			List<Test> list = openSession.selectList("emp.getTestId");
			System.out.println(list);
			mybatisInterface mapper = openSession.getMapper(mybatisInterface.class);
			Test test = mapper.getTestId(2);
			System.out.println(test);
		} finally {
			openSession.close();
		}*/
		
		test6();
	}
	public static Test test() throws FileNotFoundException{
		
		util u1=new util();
	     SqlSession openSession = u1.getsql().openSession();//openSession(ture) 为自动提交
	     try {
	    	 mybatisInterface mapper = openSession.getMapper(mybatisInterface.class);
	    	  /*  Test  t1=new Test(null,"李染",13,"女");
	    	    //long addTest = mapper.addTest(t1);
	    	    //boolean deleTest = mapper.deleTest(4);
	    	    // boolean updaTest = mapper.updaTest(t1);
	    	    long addTest = mapper.addTest(t1);
	    	    System.out.println(addTest);*/
	    	 //System.out.println(t1.getId());
	    	  //静态实例化调用提交方法需要手动提交
	    	  openSession.commit();
		} finally {
			
			openSession.close();
		}
		return null;
	}
	
	public static Test test1() throws FileNotFoundException{
		
		util u1=new util();
	     SqlSession openSession = u1.getsql().openSession();//openSession(ture) 为自动提交
	     try {
	    	 mybatisInterface mapper = openSession.getMapper(mybatisInterface.class);
	    	 Map<String, Object> map=new HashMap<>();
	    	 map.put("id", 6);
	    	 map.put("lastName", "李染");
	    	 Test testMap = mapper.getTestMap(map);
	    	  //Test test = mapper.getTestIdandlastName(1, "张三");
	    	// System.out.println(test);
	    	 System.out.println(testMap);
	    	  //静态实例化调用提交方法需要手动提交
	    	  openSession.commit();
		} finally {
			
			openSession.close();
		}
		return null;
	}
	

	public static Test test2() throws FileNotFoundException{
		
		util u1=new util();
	     SqlSession openSession = u1.getsql().openSession();//openSession(ture) 为自动提交
	     try {
	    	 mybatisInterface mapper = openSession.getMapper(mybatisInterface.class);
	    	   Map<Integer, Test> testmh = mapper.getTestmh("%李%");
	    	   System.out.println(testmh);
	    	  openSession.commit();
		} finally {
			
			openSession.close();
		}
		return null;
	}
 public static Test test3() throws FileNotFoundException{
		
		util u1=new util();
	     SqlSession openSession = u1.getsql().openSession();//openSession(ture) 为自动提交
	     try {
	    	 mybatisInterface mapper = openSession.getMapper(mybatisInterface.class);
	    	 Test testId = mapper.getTestId(2);
	    	   System.out.println(testId);
	    	  System.out.println(testId.getDepa());
	    	  openSession.commit();
		} finally {
			
			openSession.close();
		}
		return null;
	}
 public static Test test4() throws FileNotFoundException{
		
		util u1=new util();
	     SqlSession openSession = u1.getsql().openSession();//openSession(ture) 为自动提交
	     try {
	    	 mybatisInterface mapper = openSession.getMapper(mybatisInterface.class);
	    	 Test teststop = mapper.getTeststop(2);
	    	 System.out.println(teststop.getName());
	    	 //System.out.println(teststop.getDepa());
	    	  openSession.commit();
		} finally {
			
			openSession.close();
		}
		return null;
	}
 public static Test test5() throws FileNotFoundException{
		
		util u1=new util();
	     SqlSession openSession = u1.getsql().openSession();//openSession(ture) 为自动提交
	     try {
	    	 depamapper mapper = openSession.getMapper(depamapper.class);
	              department testIdplus = mapper.getTestIdplus(1);
	    	 System.out.println(testIdplus);
	    	 System.out.println(testIdplus.getTest());
	    	  openSession.commit();
		} finally {
			
			openSession.close();
		}
		return null;
	}
 public static Test test6() throws FileNotFoundException{
		
		util u1=new util();
	     SqlSession openSession = u1.getsql().openSession();//openSession(ture) 为自动提交
	     try {
	    	 depamapper mapper = openSession.getMapper(depamapper.class);
	            department testaId = mapper.getTestaId(1);
	    	 System.out.println(testaId);
	    	 System.out.println(testaId.getTest());
	    	  openSession.commit();
		} finally {
			
			openSession.close();
		}
		return null;
	}
	}



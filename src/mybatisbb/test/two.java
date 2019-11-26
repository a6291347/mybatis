package mybatisbb.test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hzh.util.util;

import mybatisbb.ben.Test;
import mybatisbb.ben.department;
import mybatisbb.dao.depamapper;
import mybatisbb.dao.mybatisInterface;

public class two {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		util u1=new util();
	     SqlSession openSession = u1.getsql().openSession();//openSession(ture) 为自动提交
	     try {
	    	 department d1=new department(7,"刘淇");
	    	 department d2=new department(8,"刘羽");
	    	 depamapper mapper = openSession.getMapper(depamapper.class);
	    	 List<department> temp = new ArrayList<>();
	    	  temp.add(d1);
	    	  temp.add(d2);
			long adddepa = mapper.adddepa(temp);
			System.out.println(adddepa);
	    	 /* for (department de : temp) {
				System.out.println(de.getId()+"--"+de.getName());
			}*/
			openSession.commit();
		} finally {
			
			openSession.close();
		}
	
	}

}

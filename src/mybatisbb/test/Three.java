package mybatisbb.test;

import java.io.FileNotFoundException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hzh.util.util;

import mybatisbb.ben.Departmentone;
import mybatisbb.dao.DepartmentDao;

public class Three {
	public static void main(String[] args) throws FileNotFoundException {
		util u1=new util();
	     SqlSession openSession = u1.getsql().openSession();
	     DepartmentDao mapper = openSession.getMapper(DepartmentDao.class);
	     List<Departmentone> selectAll = mapper.selectAll();
	     for(Departmentone iter:selectAll){
	    	System.out.println( iter.toString());
	     }
	     
	}

}

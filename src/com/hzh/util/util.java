package com.hzh.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class util {
	
	
	private SqlSessionFactory sql;
			//Builder������
	public SqlSessionFactory getsql() throws FileNotFoundException{
		FileInputStream fi=new FileInputStream("src/mybatis.xml");/*���̵�ַ*/
		return sql= new SqlSessionFactoryBuilder().build(fi);
		
		
	}

}

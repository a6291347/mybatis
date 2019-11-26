package com.hzh.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class util {
	
	
	private SqlSessionFactory sql;
			//Builder建立者
	public SqlSessionFactory getsql() throws FileNotFoundException{
		FileInputStream fi=new FileInputStream("src/mybatis.xml");/*磁盘地址*/
		return sql= new SqlSessionFactoryBuilder().build(fi);
		
		
	}

}

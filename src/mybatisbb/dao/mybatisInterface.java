package mybatisbb.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import mybatisbb.ben.Test;

public interface mybatisInterface {
	
	public Test  getTestMap(Map<String, Object> map);
	
	public Test  getTestIdandlastName(@Param("id")Integer id,@Param("lastName")String lastName);
	
	public Test  getTestId(Integer id);
	
	public long addTest(Test test);
	
	public boolean  updaTest(Test test);
	
	public boolean  deleTest(Integer id);
	@MapKey("id")  //可以使用MapKey("xx")指定map的key值属性
	public Map<Integer, Test> getTestmh(String str);
	
	public Test  getTeststop(Integer id);
	
    public List<Test> getTeststopa(Integer id);

}

package mybatisbb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mybatisbb.ben.Test;
import mybatisbb.ben.department;

public interface depamapper {
	public department  getTestId(Integer id);
	public department  getTestIdplus(Integer id);
	public department getTestaId(Integer id);
	//������� ��̬sql
	public long adddepa(@Param("temp")List<department> temp);
	
	

}

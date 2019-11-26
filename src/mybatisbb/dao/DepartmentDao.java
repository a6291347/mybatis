package mybatisbb.dao;

import java.util.List;

import mybatisbb.ben.Departmentone;

public interface DepartmentDao {
    void insert(Departmentone department);
    void delete(Integer id);
    void update(Departmentone department);
    Departmentone selectById(Integer id);
    List<Departmentone> selectAll();
}

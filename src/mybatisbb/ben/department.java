package mybatisbb.ben;

import java.util.List;

public class department {
	
	private int id;
	private String name;
	private List<Test> test;
	@Override
	public String toString() {
		return "department [id=" + id + ", name=" + name + ", test=" + test + "]";
	}
	public List<Test> getTest() {
		return test;
	}
	public void setTest(List<Test> test) {
		this.test = test;
	}
	public department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

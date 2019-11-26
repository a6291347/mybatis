package mybatisbb.ben;

public class Test {
	private Integer id;
	private String name;
	private Integer age;
	private String Sex;
	private department depa;
	
	public department getDepa() {
		return depa;
	}
	public void setDepa(department depa) {
		this.depa = depa;
	}
	public Test(Integer id, String mingzi, Integer age, String sex, department depa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		Sex = sex;
		this.depa = depa;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		this.Sex = Sex;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", age=" + age + ", Sex=" + Sex + ", depa=" + depa + "]";
	}
	
	
	

}

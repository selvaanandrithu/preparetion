package preparation;

public class StreamStudent {
	
	private String name;
	private int age;
	private char section;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public StreamStudent(String name, int age, char section,String gender) {
		super();
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "StreamStudent [name=" + name + ", age=" + age + ", section=" + section + ", gender=" + gender + "]";
	}
	
	
	
	

}

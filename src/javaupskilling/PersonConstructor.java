package javaupskilling;

public class PersonConstructor {
	private String name;
	private int age;
	
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
	
	
	public PersonConstructor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public PersonConstructor() {
		super();
		name="MOHAN";
		age=19;
	}
	public static void main(String args[])
	{
	PersonConstructor pc=new PersonConstructor();
	 System.out.println("Name:" +pc.getName());
	 System.out.println("Age:"+pc.getAge());

	PersonConstructor pc1=new PersonConstructor("HARI",21);
	System.out.println("Name:" +pc1.getName());
	 System.out.println("Age:" +pc1.getAge());
	}
	
}

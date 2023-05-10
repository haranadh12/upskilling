package javaupskilling;

public class PersonEncapsulation {
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
	
	public static void main(String args[])
	{
	PersonEncapsulation person=new PersonEncapsulation();
	person.setAge(23);
	person.setName("Anirudh");
	System.out.println("Name:"+person.getName());
	System.out.println("Age:"+person.getAge());


	}

}

package model;
public class User {
	private String name;
	private String number;
	private int age;
	private int height;
	private int weight;
	private String country;
	
	
	public String getName(String name) {
		return this.name;
	}
	
	public String getNumber(String number) {
		return this.number;
	}
	
	public int getAge(int age) {
		return this.age;
	}
	
	public int getHeight(int height) {
		return this.height;
	}
	
	public int getWeight(int weight) {
		return this.weight;
	}
	
	public String getCountry(String country) {
		return this.country;
	}
	
	public void setName() {
		this.name=name;
	}
	
	public void setNumber() {
		this.number=number;
	}
	
	public void setAge() {
		this.age=age;
	}
	
	public void setHeight() {
		this.height=height;
	}
	
	public void setWeight() {
		this.weight=weight;
	}
	
	
	 User (String name, String number, int age, int height, int weight, String country){
		 this.name=name;
		 this.number=number;
		 this.age=age;
		 this.height=height;
		 this.weight=weight;
		 this.country=country;
	 }
	
}
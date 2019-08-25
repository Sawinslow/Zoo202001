package model;

public class Sheep {
	private String age;
	private String cottoncolor;
	private String breed;

	public Sheep() {
		super();

	}

	public Sheep(String age, String cottoncolor, String breed) {
		super();
		this.age = age;
		this.cottoncolor = cottoncolor;
		this.breed = breed;
	}

	public String getage() {
		return age;
	}

	public void setage(String age) {
		this.age = age;
	}

	public String getcottoncolor() {
		return cottoncolor;
	}

	public void setcottoncolor(String cottoncolor) {
		this.cottoncolor = cottoncolor;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String speak() {
		return "Baaaaah";
	}

}

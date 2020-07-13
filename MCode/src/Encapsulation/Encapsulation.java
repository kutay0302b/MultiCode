package Encapsulation;

class Encapsulation {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newValue) {
		age = newValue;
	}

	public void setName(String newValue) {
		name = newValue;
	}

	public void setId(int newValue) {
		id = newValue;
	}
}

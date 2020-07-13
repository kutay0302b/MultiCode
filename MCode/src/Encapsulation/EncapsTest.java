package Encapsulation;

public class EncapsTest {
	public static void main(String args[]) {
		Encapsulation en = new Encapsulation();
		en.setName("kutay");
		en.setAge(23);
		en.setId(121314);
		System.out.println("Employee Name: " + en.getName());
		System.out.println("Employee ID: " + en.getId());
		System.out.println("Employee Age: " + en.getAge());
	}
}
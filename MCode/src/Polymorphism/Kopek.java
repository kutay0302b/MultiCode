package Polymorphism;

class Kopek extends Hayvan {
	@Override
	public void ses() {
		System.out.println("hav hav");
	}

	public static void main(String args[]) {
		Hayvan hy = new Kopek();
		hy.ses();
	}
}
package Polymorphism;

public class Kedi extends Hayvan{
    @Override
    public void ses(){
        System.out.println("Meow");
    }
    public static void main(String args[]){
    	Hayvan hy = new Kedi();
    	hy.ses();
    }
}
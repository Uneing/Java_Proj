package ingeritance_07.lab10_polymorphism;

public class AnimalTest2 {
	public static void moveAnimal(Animal animal) {//업캐스팅,
		animal.move();
}	
	
	
	public static void main(String args[]) {
	
		//AnimalTest2 aTest = new AnimalTest2();
		AnimalTest2.moveAnimal(new Human());
		AnimalTest2.moveAnimal(new Tiger());
		AnimalTest2.moveAnimal(new Eagle());
	
	}
}

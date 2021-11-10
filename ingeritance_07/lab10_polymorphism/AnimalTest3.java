package ingeritance_07.lab10_polymorphism;

public class AnimalTest3 {
	public static void moveAnimal(Animal animal) {//업캐스팅,
		animal.move();
}	
	
	
	public static void main(String args[]) {
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		//AnimalTest2 aTest = new AnimalTest2();
		AnimalTest2.moveAnimal(human);
		AnimalTest2.moveAnimal(tiger);
		AnimalTest2.moveAnimal(eagle);
	
	}
}

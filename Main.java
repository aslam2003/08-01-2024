//Dynamic method dispatch
class Animal{
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}
class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Meow");
	}
}
class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Woow woow woow");
	}
}
public class Main {
public static void main(String args[]) {
	Animal animal1=new Cat();//Superclass reference variable to sub class
	Animal animal2=new Dog();
	animal1.makeSound();//Call to overridden method using superclass object
	animal2.makeSound();
}
}

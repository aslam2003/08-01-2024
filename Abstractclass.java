import java.util.Scanner;
abstract class Details{
	String name;
	int age;
	String subject;
	int yearsofexperience;
	String collections_certificates;
    public abstract void data();
    public abstract void display();
}
class Teacher1 extends Details{
	public void data() {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter teacher's Name:");
	name=input.nextLine();
	System.out.print("Enter teacher's age:");
	age=input.nextInt();
	input.nextLine();
	System.out.print("Enter teacher's subject expertise:");
	subject=input.nextLine();
	input.nextLine();
	System.out.print("Enter teacher's years of experience:");
	yearsofexperience=input.nextInt();
	input.nextLine();
	System.out.print("Enter teacher's collection of certificates:");
	collections_certificates=input.nextLine();
	
}
	public void display(){
		System.out.println("Teacher's Name:"+name);
		System.out.println("Teacher's age:"+age);
		System.out.println("Teacher's subject expertise:"+subject);
		System.out.println("Teacher's years of experience:"+yearsofexperience);
		System.out.println("Teacher's collection of certificates:"+collections_certificates);	
		
	}
		
	}
public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Teacher1 obj=new Teacher1();
      obj.data();
      obj.display();

	}

}

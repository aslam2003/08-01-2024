import java.util.Scanner;
class parent{
	String name="John";
	int age=23;
}
class Student extends parent{
	Scanner input=new Scanner(System.in);
	String subject=input.next();
	int height=input.nextInt();
	public void details() {
		System.out.println(name+ age + subject + height );
	}
	
}
	
public class Hierarichal extends parent{
	Scanner input=new Scanner(System.in);
	int cgpa=input.nextInt();
	int year=input.nextInt();
	String gender=input.next();
	void inform() {
	System.out.println(name+ age+ cgpa + year+ gender);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student child=new Student();
      Hierarichal child1=new Hierarichal();
      child.details();
      child1.inform();
      
	}

}

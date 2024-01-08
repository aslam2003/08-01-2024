//Multilevel Inheritance
class Super{
	public int num1;
	public int num2;
}
class Child1 extends Super{
	public void calc() {
	num1=5;
	num2=7;
	System.out.println("Sum of "+ num1 + " AND "+ num2 +" ="+ (num1+num2));
}
}
public class Child extends Child1 {
	public void calc() {
		num1=98;
		num2=67;
		System.out.println("Sum of "+ num1 + " AND "+ num2 +" ="+ (num1+num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
		Child1 child1=new Child1();
		Super parent=new Super();
		child.calc();
		child1.calc();

	}

}


class Base{
	public void display() {
	System.out.println("This is Parent Class");
}
}
public class Single_Inheritance extends Base{
public void inform() {
	System.out.println("This is Child Class");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_Inheritance child=new Single_Inheritance();
		Base parent=new Base();
		child.display();
		child.inform();
		parent.display();
        
	}

}

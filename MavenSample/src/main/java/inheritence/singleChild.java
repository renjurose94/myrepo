package inheritence;

public class singleChild extends SingleParent{

	public void print()
	{
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleChild obj = new singleChild();
		SingleParent obj1 = new SingleParent();
		obj.print();
		obj.display();
		obj1.display();
	}

}

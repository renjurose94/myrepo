package inheritence;

public class MultiChild extends MultiInter{
	public void show()
	{
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild obj = new MultiChild();
		obj.show();
		obj.display();
		obj.print();
	}

}

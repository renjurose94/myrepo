package inheritence;

public class HeiraChild1 extends HeiraParent {
	public void print1() {
		System.out.println("Heirarchial Child Class 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeiraChild1 obj = new HeiraChild1();
		obj.print1();
		obj.print();
	}

}

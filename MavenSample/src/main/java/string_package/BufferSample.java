package string_package;

public class BufferSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				StringBuffer a = new StringBuffer("Hello");
				System.out.println(a);
				StringBuilder b = new StringBuilder("World");
				System.out.println(b);
				//insert
				System.out.println(a.insert(3, "hi"));
				//append
				System.out.println(a.append("Hiiii"));
				//replace
				System.out.println(a.replace(3, 12, "World"));
				//delete
				System.out.println(a.delete(2, 4));
				System.out.println(b.delete(4, 5));
	}

}

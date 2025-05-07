package string_package;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		// charAt
		char a = s.charAt(1);
		System.out.println(a);
		// length of String
		System.out.println(s.length());
		// concat - adding two Strings
		String b = "World";
		System.out.println(s.concat(b));
//contains
		String c = "Good Morning";
		System.out.println(c.contains("Morning"));
		System.out.println(c.contains("April"));
//isEmpty
		System.out.println(c.isEmpty());
		String d = "";
		System.out.println(d.isEmpty());
//equals
		String e = "java";
		String f = "Java";
		String g = "java";
		String h = "Selenium";
		System.out.println(e.equals(f));
		System.out.println(e.equals(g));
		System.out.println(e.equals(h));
//equalsIgnoreCase
		System.out.println(e.equalsIgnoreCase(f));
//toUpperCase
		System.out.println(e.toUpperCase());
//toLowerCase
		System.out.println(e.toLowerCase());
//valueOf - type conversion ie; every data type can be converted to string
		int i = 1;
		String j = String.valueOf(i);
		System.out.println(j);
//operator comparison
		String k = new String("Java");
		System.out.println(f.equals(k));
		System.out.println(e == g);
		System.out.println(k == f); // checked reference instead of value as we used new keyword ie; false
	}

}

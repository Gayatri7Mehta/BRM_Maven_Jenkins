package pkg_4;

public class Sum {
	int add(int a, int b) {
		int c= a+b;
		return c;
	}
public class Sub{
	int substract(int a,int b){
		int d=a+b;
		return d;
	}

public static void main(String args[]) {
	Sum obj= new Sum();
	System.out.println(obj.add(6, 7));
	System.out.println(obj.add(12, 5));

	
	
}
}

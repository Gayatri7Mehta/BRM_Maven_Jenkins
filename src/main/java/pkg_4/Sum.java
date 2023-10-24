package pkg_4;

public class Sum {
    int add(int a, int b) {
        int c = a + b;
        return c;
    }
}

class Sub {
    int subtract(int a, int b) {
        int d = a - b; 
        return d;
    }

    public static void main(String args[]) {
        Sum obj = new Sum();
        Sub obj1 = new Sub();
        System.out.println(obj.add(6, 7));
        System.out.println(obj.add(12, 5));
        System.out.println(obj1.subtract(6, 4)); 
    }
}

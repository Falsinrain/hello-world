public class Fib {
    public static void main(String[] args) {
        int n = 10;
	int x = 0, y = 1;
	while (n>0) {
	    int z = x + y;
	    x = y; y = z;
	    n -= 1;
	}
	System.out.println(x);
    }
}

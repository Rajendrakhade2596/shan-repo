
public class A {
	static int num = 97;

	public static void main(String[] args) {
		num--;
		for (int i = num-1; i >1; i--) {
			if (num % i == 0) {
				num--;
				
			}
			
		}
System.out.println(num);
	}
}

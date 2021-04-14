package lab1;

public class Question1 {

	public static void main(String[] args) {
		
		stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);
		

	}
	
	public static void stringTimes(String message, int times) {
		
		for(int i=1; i<=times; i++) {
			System.out.print(message);
		}
		System.out.println();
	}

}

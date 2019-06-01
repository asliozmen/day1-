package exceptions;

public class Error {

	public static void run() {
		System.out.println("Running...");
		run();//looping yapiyor bu error grubuna giriyor.bunun try-catch yapamiyoruz. That means it is not handable.
	}
	
	public static void main(String[]args) {
		run();
	}
}

package loopDemo;

public class Main {

	public static void main(String[] args) {
			//	FOR	
		for (int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println(" Döngü Bitti");
		
			//WHİLE
		int i=2;
		while (i<10) {
			System.out.println(i);
			i+=2;
			
		}
		System.out.println("while  Döngüsü Bitti");
		
		// do while
		int j=100;
		do {
			System.out.println(j);
			j+=2;
			
		}while(j<10);
		System.out.println("Do-while Döngüsü Bitti");
	}
}

		
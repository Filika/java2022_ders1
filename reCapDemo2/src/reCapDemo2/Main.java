package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myLıst = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myLıst[0];
		for (double number : myLıst) {
			if (max < number)
				max = number;
		}
		for (double number : myLıst) {
			total = total + number;
			System.out.println(number);
		}

		System.out.println("Toplam =" + total);
		System.out.println("En Büyük =" + max);
	}

}

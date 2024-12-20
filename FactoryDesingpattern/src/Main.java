import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the AC class  type>>");

		String Booking = scanner.nextLine();

		Booking b = BookingFactory.createBooking(Booking);

		System.out.println(b.getACClass());

		scanner.close();
	}

}

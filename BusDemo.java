package bus.com;
import java.util.Scanner;
public class BusDemo {

	public static void main(String[] args) {
	  int userOpt=1;
	  Scanner scanner = new Scanner(System.in);
		while(userOpt==1) {
			System.out.println("Enter 1 to book bus ticket and 2 to exist the page");
		    userOpt = scanner.nextInt();
		    if(userOpt == 1) {
		    	System.out.println("Booking..,");
		    }
	 }
	}

}

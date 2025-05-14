package package_1;
import java.util.*;

public class withdraw {
	public static void main(String[] a) {
		atm user=new atm(123,00);
		Scanner sc=new Scanner(System.in);
		boolean atm=true;
			while(atm) {
				System.out.println("Enter 1 to withdraw");
				System.out.println("Enter 2 to deposit");
				System.out.println("Enter 3 to exit");
				int cas=sc.nextInt();
					switch(cas) {
						case 1:
							user.getmoney();
							break;
						case 2:
							System.out.println("Enter the pin for deposit money");
							int pin=sc.nextInt();
							System.out.println("Enter the money");
							int money=sc.nextInt();
							user.setmoney(money,pin);
							break;
						case 3:
							atm=false;
							break;
						default:
							System.out.println("give correct input");
					}
			}
	}
}

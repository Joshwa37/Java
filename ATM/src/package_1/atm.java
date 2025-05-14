package package_1;
import java.util.*;
public class atm {
	private int money;
	private int pin;
	
	
	atm(int pin,int money){
		this.pin=pin;
		this.setmoney(money);
	}
	
	private void setmoney(int money) {
		this.money=money;
	}
	void setmoney(int money,int pin) {
		
		
		
		
		if(pin==this.pin) {
			this.money+=money;
			System.out.println("Balance"+this.money);
		}
		else {
			System.out.println("Invalid");
		}
		
	}
	
	void getmoney() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin for withdraw");
		int pin=sc.nextInt();
		
		if(this.pin==pin) {
			System.out.println("Enter money");
			int money=sc.nextInt();
			
			if(this.money>money) {
			this.money-=money;
			System.out.println(money);
			System.out.println("Balance"+this.money);
			}
			else {
				System.out.println("Insufficient money");
			}
			

		}
		else {
			System.out.println("Invalid");
		}
		
		
	}
	
	
}


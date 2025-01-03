
    import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num 1");
        double num1=s.nextDouble();
        System.out.println("enter num 2");
        double num2=s.nextDouble();
        System.out.println("what operation want to do +,-,*,/ ");
        char op= s.next().charAt(0);
        switch(op){
            case '+':
                System.out.println(num1+num2);
		break;	
            
            case '-':
                System.out.println(num1-num2);
		break;

                
              case '*':
                System.out.println(num1*num2);
                		break;

              case '/':
                System.out.println(num1/num2);
                		break;


        }
        

    }
    
}


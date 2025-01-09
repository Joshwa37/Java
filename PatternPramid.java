import java.util.Scanner;
public class Batch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
    int f1=(num+1)/2;
    int f2=(num+1)/2;
    int i=1;
    while(i<=(num+1)/2){
    for(;i<=num;i++){
        for(int j=1;j<=num;j++){
            if(i<=(num+1)/2&&(j<=f1&&j>=f2)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }

        }
         f1++;
         f2--;
         System.out.println();
         }
        }
    }
    
}


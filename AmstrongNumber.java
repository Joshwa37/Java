import java.util.Scanner;

class Batch2{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int an=num;
    int check=num;
    int count=0;
    double ams=0;
    double ams1=0;
    while(num>0){
        num/=10;
        count++;
    }
    while(an>0){
        ams=an%10;
        ams1=ams1+Math.pow(ams,count);
        an/=10;
    }
    if(check==ams1){
        System.out.println("ams");
    }
    else{
        System.out.println("not");
    }
    }

}

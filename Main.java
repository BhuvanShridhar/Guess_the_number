import java.util.Scanner;
public class Main
{
    
 public static void main (String[] args)
{
   Scanner sc = new Scanner(System.in);
   int myNumber=(int)(Math.random()*100);
   int userNumber=sc.nextInt();
   
   do{
       System.out.println("Guess the number");
       userNumber=sc.nextInt();
       if(userNumber==myNumber)
       {
           System.out.println("LESSSS GOOO YOU got it right");
       }
       
       else
       if(userNumber<myNumber)
       {
           System.out.println("boo wrong guess!, is lesser");
       }
        else
       if(userNumber>myNumber)
       {
           System.out.println("boo wrong guess!, is greater");
       }
       
   }while(userNumber>=0);
}
}

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0 ;
        System.out.println(" digite um numero :");
        num = in.nextInt();
        if ((num % 2)== 0){
        System.out.println("Esse e o numero par");
        }
        if ((num % 2) !=0){
        System.out.println(" Esse numero e impar");
        }
}   }     //ele testa se o numero e par ou impar   


  

package problems;
import java.util.*;

public class is_LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("It's a Leap Year");
        }else{
            System.out.println("It is not a Leap Year");
        }
        sc.close();
    }
}

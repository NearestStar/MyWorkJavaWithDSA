package problems;

import java.util.Scanner;

public class marks_And_Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for sublect 1: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter the marks for sublect 2: ");
        int marks2 = sc.nextInt();

        System.out.println("Enter the marks for sublect 3: ");
        int marks3 = sc.nextInt();

        System.out.println("Enter the marks for sublect 4: ");
        int marks4 = sc.nextInt();

        System.out.println("Enter the marks for sublect 5: ");
        int marks5 = sc.nextInt();

        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println("Total Marks: "+totalMarks);
        float percentage = (totalMarks/500.0f)*100;
        System.out.println("Percentage: "+percentage);

        if(percentage>=90){
            System.out.println("Grade A");
        }else if(percentage>=80){
            System.out.println("Grade B");
        }else if(percentage>=70){
            System.out.println("Grade C");
        }else if(percentage>=60){
            System.out.println("Grade D");
        }else if(percentage>=50){
            System.out.println("Grade E");
        }else{
            System.out.println("Grade F");
        }
        sc.close();
}
}
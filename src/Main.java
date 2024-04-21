//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice;

        System.out.println("choose your option");
        System.out.println("A. addition");
        System.out.println("B. subtraction");
        System.out.println("C. multiplication");
        System.out.println("D. division");
        System.out.println("E. EXIT");

        choice = scanner.next().charAt(0);
        scanner.nextLine();

        switch (choice){
            case 'A':operation(scanner,'+');break;
            case 'B':operation(scanner,'-');break;
            case 'C':operation(scanner,'*');break;
            case 'D':operation(scanner,'/');break;
            case 'E': System.out.println("Terminating the program...");break;
            default:System.out.println("Invalid choice. Please try again.");
        }
    }
    private static void operation(Scanner scanner,char operation){
        System.out.println("Enter the first number:  ");
        float a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        float b = scanner.nextInt();

        float result = 0;
        switch (operation){
            case '+':result = a + b ;break;
            case '-':result = a - b ;break;
            case '*':result = a * b ;break;
            case '/':result = a / b ;break;
        }
        System.out.println("the answer is :"+result);
    }
}
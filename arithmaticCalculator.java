//ARITHMATIC CALCULATOR


import java.util.Scanner;

import java.util.*;

class arithmaticCalculator {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);

   
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

   
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

     
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result); // FOR ADDITION
        break;

     
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);// FOR SUBSTRACTION
        break;

      
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result); //FOR MULTIPLICATION
        break;

     
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result); // FOR DIVISION
        break;

      default:
        System.out.println("Invalid operator!"); // INVALID CHOICE MESSAGE.
        break;
    }
  }
}
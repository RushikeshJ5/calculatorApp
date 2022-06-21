import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    int choice;
    Double number1, number2, result;

  
    Scanner input = new Scanner(System.in);

   do{
    System.out.println("Choose an operation to perform: \n 1.ADD \n 2.SUB \n 3.MUL \n 4.DIV \n 5.EXIT");
    choice = input.nextInt();

    
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    System.out.println("Enter second number");
    number2 = input.nextDouble();

    switch (choice) {

      
      case 1:
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      
      case 2:
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

     
      case 3:
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      
      case 4:
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

    //   case 5:
    //     result = (number1/number2)*100;
    //     System.out.println(number1 + " percent of "+ number2 +" = " + result);
    //     break;
      
      case 5:
       break; 

      default:
        System.out.println("Invalid Choice!");
        break;
    }
   }while(choice!=5);
    input.close();
  }
}

import java.util.Scanner;

public class Functions {

    // To call a function from the main method, we need to mark it as static.
    // The return type is void because it doesn't return any value.
    // The signature of the function is the first line (the method header).
    // The body of the function is the part enclosed in the curly braces.
    static void greeting(String message) {
        System.out.println(message);
    }
    
    // Sum
    static int sum(int a, int b) {
        return a + b;
    }
    
    
    // is Even
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
    

    // this is the main function
    public static void main(String[] args) {
        // this pauses the main to execute the function until that execution ends
        // then continue with the rest of this function
        greeting("Hello");
        
        // execution of sum
        int resultado = sum(3, 6);
        System.out.println("resultado = " + resultado);
        
        
        // execution isEven
        System.out.println("Insert a number:");
        int number = Integer.parseInt(new Scanner(System.in).nextLine());
        boolean resultEven = isEven(number);
        System.out.println("Is even number? " + (resultEven ? "yes" : "no"));
    }
    
    

}

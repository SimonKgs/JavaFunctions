public class RecursiveFunction {

    // A recursive function is a function that calls itself during its execution
    // to solve a problem by breaking it down into smaller sub-problems of the same type
    // Recursion continues until a base case is reached
    // when it is reached it unwinds recursion and the result are multiplied
    static int factorial(int n) {
        // base case
        if ( n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // recursive call
    }

    // print values from 1 to 5
    static void recursiveFunction(int number){
        // base case
        if ( number == 0){
            return;
        }
        recursiveFunction(number - 1); // here it pauses the code until resolve the function
        System.out.println(number); // first will print 1 then 2, 3, 4...
    }

    public static void main(String[] args) {
        
        
        int factorial = factorial(4);
        System.out.println("factorial = " + factorial);
        recursiveFunction(5);
    }
}

package A2Z._01_Basics._01_things_to_know;

public class _03_if_else_statement {

/*
    Decision-Making in Programming:
        Similar to decision-making in real life.
        Control statements used to control flow of execution based on conditions.
        Cause execution flow to advance and branch based on program state changes.

    Java’s Selection Statements:
        if
        if-else
        nested-if
        if-else-if ladder
        switch-case
        Jump statements: break, continue, return
 */

    public static void main(String[] args) {

/*
if Statement:

    Simple decision-making statement.
    Executes block of statements if condition is true.
 */

        int i = 10;
        if (i < 15 )
            System.out.println("Inside if block");
            System.out.println("10 is less than 15");
        System.out.println("I am Not in if");


/*
if-else Statement:

    Executes block of code if condition is true.
    Executes else block if condition is false.
 */


        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");

/*
Nested-if Statement:

    if statement inside another if statement.
    Allows nesting for complex conditions.
 */

        if (i == 10 || i<15) {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");

            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println(
                        "i is smaller than 12 too");
        } else{
            System.out.println("i is greater than 15");
        }

/*
if-else-if Ladder:

    User can decide among multiple options.
    if statements executed from top down.
    Executes first true condition block.
    Allows multiple else if blocks and one else block.
 */
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");

/*
switch-case Statement:

    Multiway branch statement.
    Dispatches execution based on expression value.
 */

        int num=20;
        switch(num) {
            case 5:
                System.out.println("It is 5");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 15:
                System.out.println("It is 15");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            default:
                System.out.println("Not present");
        }
/*
    Jump Statements:
        Control transfer statements.
        break: Terminates switch statement or loop.
        continue: Skips remaining code in loop iteration.
        return: Exits current method or function.
 */
        for ( i = 0; i < 10; i++) {
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;

            // If number is odd, print it
            System.out.print(i + " ");
        }

        boolean t = true;
        System.out.println("Before the return.");

        if (t)
            return;

        // Compiler will bypass every statement
        // after return
        System.out.println("This won't execute.");

    }
}

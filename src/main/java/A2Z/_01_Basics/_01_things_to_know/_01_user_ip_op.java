package A2Z._01_Basics._01_things_to_know;
import java.io.*;
import java.util.Scanner;

public class _01_user_ip_op {

/*
Q~ How to Take Input From User in Java?
A~ Java brings various Streams with its I/O package that helps the user perform all the Java input-output operations.
   Methods to Take Input in Java
   There are two ways by which we can take Java input from the user or from a file
   * BufferedReader Class
   * Scanner Class
*/
    public static void main(String[] args) throws IOException{

/*
  BufferedReader Class for String Input In Java:
    Used for reading a sequence of characters.
    Functions:
        read(): Reads a single character.
        read(char[] cbuf): Reads characters into a buffer.
        readLine(): Reads a line of text.
    InputStreamReader():
        Converts byte input stream to character stream.
        Required by BufferedReader to read characters.
    Exception handling:
        BufferedReader can throw checked Exceptions.
*/

        // Creating BufferedReader Object
        // InputStreamReader converts bytes to
        // stream of character
        BufferedReader bfn = new BufferedReader(
                new InputStreamReader(System.in));

        // String reading internally
        System.out.println("Type String :");
        String str = bfn.readLine();

        // Integer reading internally
        System.out.println("Type Integer :");
        int it = Integer.parseInt(bfn.readLine());


        // Printing String
        System.out.println("Entered String : " + str);

        // Printing Integer
        System.out.println("Entered Integer : " + it);

/*
  Scanner Class for Taking Input in Java:

    Advanced version of BufferedReader.
    Added later in Java versions.
    Capable of reading formatted input.
    Functions for different data types:
        nextInt(): Read integer.
        nextFloat(): Read float.
        next(): Read string.
        nextLine(): Read string with spaces.
    No exception handling required.
    Syntax: Scanner scn = new Scanner(System.in);
    Importing Scanner Class: import java.util.Scanner;
    Inbuilt Scanner functions:
        Integer: nextInt()
        Float: nextFloat()
        String: next() and nextLine()
    No parsing required for Integer and String inputs.
*/
        // Scanner definition
        Scanner scn = new Scanner(System.in);

        // input is a string ( one word )
        // read by next() function
        String str1 = scn.next();

        // print String
        System.out.println("Entered String str1 : " + str1);

        // input is a String ( complete Sentence )
        // read by nextLine()function
        String str2 = scn.nextLine();

        // print string
        System.out.println("Entered String str2 : " + str2);

        // input is an Integer
        // read by nextInt() function
        int x = scn.nextInt();

        // print integer
        System.out.println("Entered Integer : " + x);

        // input is a floatingValue
        // read by nextFloat() function
        float f = scn.nextFloat();

        // print floating value
        System.out.println("Entered FloatValue : " + f);
    }
}

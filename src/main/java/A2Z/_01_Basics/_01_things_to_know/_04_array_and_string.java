package A2Z._01_Basics._01_things_to_know;

public class _04_array_and_string {

/*
    ##################################################################
    --> ARRAY
    ##################################################################

    Arrays in Java:

        All arrays are dynamically allocated.
        Stored in contiguous memory.
        Length accessed using object property length.
        Declared with [] after data type.
        Variables ordered with indices starting from 0.
        Can be static field, local variable, or method parameter.
        Can contain primitives or object references.
            Primitives may be stored contiguously (not guaranteed).
            Objects stored in heap segment.

    One-Dimensional Arrays:

        General form of declaration:
            type var-name[];
            type[] var-name.
        Declaration includes element type and name.
        Element type determines data type held.
        Declaration only establishes array variable, no physical array.
        Array instantiation:
            Use new keyword.
            Syntax: var-name = new type[size].

    Array Literal in Java:

        When size and values are known, array literals can be used.
        Syntax:

        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        Length of literal determines array length.
        In newer Java versions, "new int[]" part can be omitted.

    Accessing Array Elements using for Loop:

        Elements accessed via index (0 to size - 1).
        Utilize Java for Loop to access all elements.

    #####################################################################
    -->   STRING
    #####################################################################

    Strings in Java:
        Objects storing character values.
        Each character stored in 16 bits using UTF-16 encoding.
        Acts as array of characters.
        Two ways to create strings: String Literal, Using new Keyword.

    String Literal:
        More memory efficient.
        No new objects if string exists in constant pool.

    Using new Keyword:
        Creates new string object in heap memory.
        Literal placed in string constant pool.

    Interfaces and Classes in Strings in Java:
        CharBuffer: Implements CharSequence interface.
        CharSequence Interface: Represents sequence of characters.
        Classes implementing CharSequence:
            String
            StringBuffer
            StringBuilder

    Immutable String in Java:
        String objects are immutable.
        Once created, cannot be changed.
        Modification creates new string object.

    Memory Allotment of String:
        String Literal: Stored in String constant pool.
        Using new Operator: Dynamically allocated in heap.
        String pool moved from PermGen to heap for efficiency.
            PermGen space limited (default: 64 MB).
            String pool size limitation.

    Advantages of String Literal:
        Optimizes initialization of String literals.
        Reduces overhead of creating and storing string objects.

    Move of String Pool to Heap:
        PermGen space limitation.
        String pool moved to larger heap area.
        Enhances memory efficiency in Java.

 */
public static void main(String[] args) {
    System.out.println("Arrays and String");
}
}

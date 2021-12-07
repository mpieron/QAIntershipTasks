package JavaBasicForQACourse;

import java.util.*;

public class JavaLanguage {
    /*
    4. Variables, Data Types, and Math Operators

    Task 1
    What will be the output of the following program?
    public class Precedence {
        public static void main(String[] args) {
            int x = 20;
            int y = 10;
            double z = x++ - y * 7 / --y + x * 10;
            System.out.println(z);
        }
    }

--  Solution: 223

    What is the range of int in Java?
    Solution: 2^32 - 2^32-2

    What is the range of char in Java?
--  Solution: 2^16 - 2^16-2

    Task 4
    Order the following in the increasing order of the byte size:
    byte
    int
    long
    ++char

--  Solution: byte,char, int, long

    5.Conditional Logic, Looping, and Arrays

    Task (loop)
    Finding a maximum value in array of 100 integers

--  Solution:
    public int findMax(int[] arr){
        if(arr == null || arr.length == 0)
            return 0;

        int max = arr[0];

        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    6.Representing Complex Types with Classes

    Task 1
    What type of access (private, public) does the member of the class have by default?
--  Solution: public

    Task 2
    Given the following declaration of a class, which fields are accessible from outside the package com.corporation.project?

    package com.corporation.project;
    public class MyClass {
        int i;
        public int j;
        protected int k;
        private int l;
    }

    Select the two correct answers.
    (a)  Field i is accessible in all classes in other packages.
    (b)  Field j is accessible in all classes in other packages.
    (c)  Field k is accessible in all classes in other packages.
    (d)  Field k is accessible in subclasses only in other packages.
    (e)  Field l is accessible in all classes in other packages.
    (f)  Field l is accessible in subclasses only in other packages.

--  Solution: b, d but in all subclasses, not ony in other package

    7. Class Initializers and Constructors

    Task 1
    Can a constructor be called by the usual class method?
--  Solution: No, it can't be called. Constructor can be called only form another constructor of the same class.

    8. A Closer Look at Parameters

    Which method declarations are valid declarations? Select the three correct answers.

    (a) void compute(int... is) { }
    (b) void compute(int is...) { }
    (c) void compute(int... is, int i, String... ss) { }
    (d) void compute(String... ds) { }
    (e) void compute(String... ss, int len) { }
    (f) void compute(char[] ca, int... is) { }

--  Solution: b, c, e

    9. Class Inheritance

    Task 1 (Inheritance)
    https://www.hackerrank.com/challenges/java-inheritance-1/problem

--  Solution:
    class Bird extends Animal{
	    void fly(){
		    System.out.println("I am flying");
	    }
        void sing(){
            System.out.println("I am singing");
        }
    }

    public class Solution{
        public static void main(String args[]){
            Bird bird = new Bird();
	        bird.walk();
	        bird.fly();
            bird.sing();
        }
    }

    Task 2 (Abstract class)
    https://www.hackerrank.com/challenges/java-abstract-class/problem

--  Solution:
    private class MyBook extends Book{
        void setTitle(String s){
        this.title = s;
        }
    }

    Task 3 (Super keyword)
    https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem

--  Solution:
    String temp=super.define_me(); //Fix this line

    10.More About Data Types

    Task 1
    Show two ways to concatenate two strings together to get the string "Hi, guys.":
    String hi = "Hi, ";
    String mom = "guys.";

--  Solution:
    String hiGuys1 = hi + mom;
    String hiGuys2 = hi.concat(mom);

    Task 2
    https://www.hackerrank.com/challenges/java-strings-introduction/problem

--  Solution:
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int length = A.length() + B.length();
        String isGreater = A.compareTo(B) > 0 ? "Yes" : "No";
        String combined = A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(length);
        System.out.println(isGreater);
        System.out.println(combined);
    }

    Task 3
    https://www.hackerrank.com/challenges/java-substring/problem

--  Solution:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }

    11. Exceptions and Error Handling
    https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

--  Solution:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int first = in.nextInt();
            int second = in.nextInt();
            System.out.println(first/second);
        }
        catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }

    13. Creating Abstract Relationships with Interfaces

    Task 1
    https://www.hackerrank.com/challenges/java-interface/problem

--  Solution:
    private class MyCalculator implements AdvancedArithmetic{
        public int divisor_sum(int n){
            int sum = 0;
            for(int i=n; i>0; i--){
                if(n%i == 0)
                    sum += i;
            }
            return sum;
        }
    }

    Task 2
    Which statements about interfaces are true?
    Select the two correct answers.
    (a)  Interfaces allow multiple implementation inheritance.
    (b)  Interfaces can be extended by any number of interfaces.
    (c)  Interfaces can extend any number of interfaces.
    (d)  Members of an interface are never static.
    (e)  Members of an interface can always be declared static.

--  Solution: a,c

    Task 3
    Which of these field declarations are legal within the body of an interface?
    Select the three correct answers.
    (a) public static int answer = 42;
    (b) int answer;
    (c) final static int answer = 42;
    (d) public int answer = 42;
    (e) private final static int answer = 42;

--  Solution: a,c,d

    Task 4
    Which statements about the keywords extends and implements are true?
    Select the two correct answers.
    (a)  The keyword extends is used to specify that an interface inherits from another interface.
    (b)  The keyword implements is used to specify that an interface inherits from
    another interface.
    (c)  The keyword implements is used to specify that a class inherits from an
    interface.
    (d)  The keyword implements is used to specify that a class inherits from another class.

--  Solution: a,c

    Task 5
    Which statement is true about the following code?
    // Filename: MyClass.java
    abstract class MyClass implements Interface1, Interface2 {
    public void f() { }
    public void g() { }
    }
    interface Interface1 {
    int VAL_A = 1;
    int VAL_B = 2;
    void f();
    void g();
    }
    interface Interface2 { int VAL_B = 3;
    int VAL_C = 4;
    void g();
    void h();
    }

    Select the one correct answer.
    (a)  MyClass only implements Interface1. Implementation for void h() fromInterface2 is missing.
    (b)  The declarations of void g() in the two interfaces conflict, therefore, the code will not compile.
    (c) The declarations of int VAL_B in the two interfaces conflict, therefore, the code will not compile.
    (d) Nothing is wrong with the code, it will compile without errors.

--  Solution: d

    Task 5
    Which declaration can be inserted in (1) without causing a compilation error?
    interface MyConstants {
    int r = 42;
    int s = 69;
    // (1) INSERT CODE HERE
    }
    Select the two correct answers.
    (a) final double circumference = 2 * Math.PI * r;
    (b) int total = total + r + s;
    (c) int AREA=r*s;
    (d) public static MAIN = 15;
    (e) protected int CODE = 31337;

--  Solution: a,c

    14. Static Members, Nested Types, and Anonymous Classes

    Task 1
    Which statement is true? Select the one correct answer.
    (a)  A static method can call other non-static methods in the same class by using this keyword.
    (b)  A class may contain both static and non-static variables, and both static and non-static methods.
    (c)  Each object of a class has its own instance of the static variables declared in the class.
    (d)  Instance methods may access local variables of static methods.
    (e)  All methods in a class are implicitly passed this reference as argument, when invoked.

    Solution: b

    Task 2
    What would be the result of compiling and running the following program?
    class MyClass {
        static MyClass ref;
        String[] arguments;
        public static void main(String[] args) {
            ref = new MyClass();
            ref.func(args);
        }

        public void func(String[] args) {
            ref.arguments = args;
        }
    }
    Select the one correct answer.
    (a)  The program will fail to compile, since the static method main() cannot have a call to the non-static method func().
    (b)  The program will fail to compile, since the non-static method func() cannot access the static variable ref.
    (c)  The program will fail to compile, since the argument args passed to the static method main() cannot be passed to the non-static method func().
    (d)  The program will compile, but will throw an exception when run.
    (e)  The program will compile and run successfully.

--  Solution: c

    Task 3
    Given the following member declarations, which statement is true?
    int a; //1
    static int a; //2
    int f() {return a;} //3
    static int f() {return a;} //4
    Select the one correct answer.
    (a)  Declarations (1) and (3) cannot occur in the same class declaration.
    (b)  Declarations(2) and (4) cannot occur in the same class declaration.
    (c)  Declarations (1) and (4) cannot occur in the same class declaration.
    (d)  Declarations (2) and (3) cannot occur in the same class declaration.

--  Solution: c
    */

}

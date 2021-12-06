package JavaBasicForQACourse;

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

    Solution: 223

    What is the range of int in Java?
    Solution: 2^32 - 2^32-2

    What is the range of char in Java?
    Solution: 2^16 - 2^16-2

    Task 4
    Order the following in the increasing order of the byte size:
    byte
    int
    long
    ++char

    Solution: byte,char, int, long

    5.Conditional Logic, Looping, and Arrays

    Task (loop)
    Finding a maximum value in array of 100 integers

    Solution:
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
    Solution: public

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

    Solution: b, d but in all subclasses, not ony in other package

    7. Class Initializers and Constructors

    Task 1
    Can a constructor be called by the usual class method?
    Solution: No, it can't be called. Constructor can be called only form another constructor of the same class.

    8. A Closer Look at Parameters

    Which method declarations are valid declarations? Select the three correct answers.

    (a) void compute(int... is) { }
    (b) void compute(int is...) { }
    (c) void compute(int... is, int i, String... ss) { }
    (d) void compute(String... ds) { }
    (e) void compute(String... ss, int len) { }
    (f) void compute(char[] ca, int... is) { }

    Solution: b, c, e

    9. Class Inheritance

    Task 1 (Inheritance)
    https://www.hackerrank.com/challenges/java-inheritance-1/problem

    Solution:
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

    Task 3 (Super keyword)
    https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem
    */

}

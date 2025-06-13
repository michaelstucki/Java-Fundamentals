package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(2, 5));
        System.out.println(divide(10, 5));
        joke();
        System.out.println(yearsToSeconds(1));
        System.out.println(myVarargs(1, 2, 3, 4));
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b) {
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    static void joke() {
        System.out.println("What did one ear of corn say to another? I'm all ears! I love corny jokes!");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static long yearsToSeconds(int years) {
        return (long) years * 365 * 24 * 3600;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int myVarargs(int...nums) {
        return nums.length;
    }






}

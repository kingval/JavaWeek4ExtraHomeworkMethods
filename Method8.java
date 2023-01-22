package JavaWeek4ExtraHomeworkMethods;

public class Method8 {


    static void myMethod(int num1, int num2, String name) {
        System.out.println("Value of num1 * num2 = "+ num1 * num2);
        System.out.println(name);
    }

    public static void main(String[] args) {
        myMethod(10, 20, "num 1 is 10, num 2 is 20");
        myMethod(25, 25, "num 1 is 25, num 2 is 25");
        myMethod(51, 49, "num 1 is 51, num 2 is 49");
    }



}

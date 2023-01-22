package JavaWeek4ExtraHomeworkMethods;

public class Method9 {

    static void myMethod(float xmasBonusPercentage, int mySalary) {
        System.out.println("My salary with my bonus is " + xmasBonusPercentage * mySalary);
    }

    public static void main(String[] args) {
        myMethod(1.10f, 10000 );
    }


}

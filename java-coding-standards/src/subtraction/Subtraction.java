package subtraction;

public class Subtraction {
    public void sub_nos_int() {
        int no1 = 10;
        int no2 = 20;

        System.out.println("Subtraction of no1 and no2 is " + (no1 - no2));

    }

    public void sub_nos_float() {
        float no1 = 1.2f;
        float no2 = 2.3f;

        System.out.println("Subtraction of no1 and no2 is " + (no1 - no2));

    }

    public void sub_nos_double() {
        double no1 = 45.56;
        double no2 = 352.4;

        System.out.println("Subtraction of no1 and no2 is " + (no1 - no2));
    }

    public void sub_nos_long() {

        long no1 = 46841246;
        long no2 = 4861853;

        System.out.println("Subtraction of no1 and no2 is " + (no1 - no2));
    }

    public static void main(String[] args) {

        Subtraction demo = new Subtraction();

        demo.sub_nos_int();
        demo.sub_nos_float();
        demo.sub_nos_double();
        demo.sub_nos_long();



    }
}

package se.ecutb.erik;

public class OverloadingDemo {

    public static void main(String[] args) {
        System.out.println(sum(3.4,4));
    }

    public static double sum(double decimal, double decimal2){
        return decimal + decimal2;
    }

    public static String sum(int integer, int integer2){
        StringBuilder sb = new StringBuilder();
        sb.append(integer + " + " + integer2 + " = " + (integer+integer2));
        return sb.toString();
    }

}

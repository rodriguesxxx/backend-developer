package backend.study.services;

public class Calculator {

    public static double sum(double x, double y){
        return x + y;
    }
    public static double sub(double x, double y){
        return x - y;
    }
    public static double mult(double x, double y){
        return x * y;
    }

    public static double div(double x, double y) { return Math.max(x, y) /  Math.min(x, y); }
}

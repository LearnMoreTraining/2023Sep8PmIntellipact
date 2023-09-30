package javabasics;

public class OverRide1 extends OverRide2 {

    public static void main(String[] args) {

        OverRide1 h = new OverRide1();
        h.m1();

    }

    public void m1(){
        System.out.println("1");
    }
}

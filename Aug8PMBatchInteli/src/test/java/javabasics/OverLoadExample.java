package javabasics;

public class OverLoadExample {

    public static void main(String[] args) {

        OverLoadExample o = new OverLoadExample();
        o.m1(4);

    }

    public  void m1(int a){

        System.out.println(a);
    }

    public  void m1(String d){

        System.out.println(d);
    }

    public  void m1(int a , int n){

        System.out.println(a);
    }

    public  void m1(int a , String n){

    }
}

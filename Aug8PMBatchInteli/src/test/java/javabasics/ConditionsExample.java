package javabasics;

public class ConditionsExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 20 ;


        String a2 = "xyz";



        if (a == b){

            System.out.println("a");
            System.out.println("equal");
        }
        else if (a > b){

            System.out.println("a is greater");
        }
        else if (a < b){

            System.out.println("b is lesser");
        }

        else{

            System.out.println("not equal");
        }

    }
}

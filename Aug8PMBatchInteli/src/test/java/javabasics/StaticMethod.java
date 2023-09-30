package javabasics;

public class StaticMethod {

   public static int a = 10 ;

    public static void m1(){  //static method // no need to create object

        //accepts only static data

        System.out.println(a);
    }

    public void m2(){ // non static method

        System.out.println(a);

        // create the object for the respective class

        // accepts static as well as non static data
    }
}

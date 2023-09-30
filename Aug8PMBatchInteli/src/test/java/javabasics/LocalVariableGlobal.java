package javabasics;

public class LocalVariableGlobal {

    //global variable

    int h ;   // 10


    int c = 100; // global variable
    public void m2(){
        int b = 10 ; // local variable
        System.out.println(b);
        System.out.println(c);
    }

    public void m1(){

        System.out.println(c);
    }

    public void a1(){

        int b = 10 ; //local variable
    }

    public void a2(){
        h = 10 ;
    }


}

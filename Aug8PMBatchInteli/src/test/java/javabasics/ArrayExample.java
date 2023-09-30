package javabasics;

public class ArrayExample {

    public static void main(String[] args) {

        int [] a = {67,89,23,11}; // 0,1,2,3  // size - 4

        for(int k:a){
            System.out.println(k);
        }

        for(int j=0; j < a.length ; j++ ){

            System.out.println(a[j]);
        }


        String [] name = {"aravinth", "learnmore"}; // 0,1

        for(String o:name){
            System.out.println(o);
        }




    }
}

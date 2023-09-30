package javabasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(23);
        l.add(89);
        System.out.println(l);
        l.add(78);
        l.add(54);
        l.add(54);
        l.add(1,1);
        System.out.println(l);

        for(int h:l){
            System.out.println(h);
        }

        System.out.println(l.get(1));

        List <String> k = new ArrayList<>();
        k.add("er");
        k.add("aravinth");

        for(String h:k){
            System.out.println(h);
        }

        System.out.println(k);

        Set<Integer> s = new HashSet<Integer>();
        s.add(55);
        s.add(34);
        s.add(2);
        s.add(55);
        s.add(9);
        System.out.println(s);

        for(int out:s){
            System.out.println(out);
        }
    }
}

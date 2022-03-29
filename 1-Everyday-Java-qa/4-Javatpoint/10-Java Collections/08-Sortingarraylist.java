import java.util.*;
class Main{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(55);
        list2.add(35);
        list2.add(9);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        
    }
}

/*
[Banana, Apple, Orange]
[Apple, Banana, Orange]
[5, 55, 35, 9]
[5, 9, 35, 55]
*/
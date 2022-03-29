import java.util.*;
class Main{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("grapes");
        list.add("banana");
        // list.add(5);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("second element is "+list.get(1));
        System.out.println("initially: "+list);
        list.set(0,"Dates");
        System.out.println("after change: "+list);
    }
}

/*
grapes
banana
second element is banana
initially: [grapes, banana]
after change: [Dates, banana]
*/
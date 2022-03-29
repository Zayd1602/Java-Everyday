import java.util.*;
class Main{
    public static void main(String args[]){
        Deque<String> d = new ArrayDeque<>();
        d.add("Gautam");
        d.add("Karan");
        d.add("Ajay");
        Iterator itr = d.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        System.out.println(d);
        for (String str: d){
            System.out.println(str);
        }
    }
}

/* 
Output is
[Gautam, Karan, Ajay]
Gautam
Karan
Ajay
*/
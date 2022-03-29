import java.util.*;
class Main{
    public static void main(String args[]){
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        // doesn't allow to store the duplicate items
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

/*
Output is 
Vijay
Ravi
Ajay
*/
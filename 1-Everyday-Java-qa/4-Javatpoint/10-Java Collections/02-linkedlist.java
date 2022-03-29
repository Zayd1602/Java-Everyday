/*
LinkedList can store the duplicate elements and maintains an insertion order and is not synchronized.
Here manipulation is fast.
*/

import java.util.*;
class Main{
  public static void main(String args[]){
    LinkedList<String> al=new LinkedList<String>();
    al.add("Ravi");
    al.add("Vijay");
    al.add("Ravi");
    al.add("Ajay");
    Iterator itr = al.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}

// Output is
// Ravi
// Vijay
// Ravi
// Ajay
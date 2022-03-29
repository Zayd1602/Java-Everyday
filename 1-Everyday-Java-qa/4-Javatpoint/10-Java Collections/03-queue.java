import java.util.*;
class Main{
  public static void main(String args[]){
    PriorityQueue<String> queue = new PriorityQueue<String>();
    queue.add("Amit Sharma");
    queue.add("Vijay Raj");
    queue.add("JaiShankar");
    queue.add("Raj");
    System.out.println("head: "+queue.element());
    System.out.println("head: "+queue.peek());
    System.out.println("----iterating the queue elements----");
    Iterator itr = queue.iterator();
    // while(itr.hasNext()){
    //   System.out.println(itr.next());
    // }
    System.out.println("Original: "+queue);
    queue.remove();//deletes the head
    System.out.println("Head of queue removed: "+queue);//fetches the first element and then removes it
    queue.poll();
    System.out.println("First element removed: "+queue);
    System.out.println("----after removing two elements------");
    Iterator<String> itr2 = queue.iterator();
    while(itr2.hasNext()){
      System.out.println(itr2.next());
    }
  }
}

/* 
Output is 

head: Amit Sharma
head: Amit Sharma
----iterating the queue elements----
Original: [Amit Sharma, Raj, JaiShankar, Vijay Raj]
Head of queue removed: [JaiShankar, Raj, Vijay Raj]
First element removed: [Raj, Vijay Raj]
----after removing two elements------
Raj
Vijay Raj

*/
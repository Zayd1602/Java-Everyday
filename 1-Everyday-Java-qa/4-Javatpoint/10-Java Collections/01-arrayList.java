import java.util.*;

class Main{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("S");
        list.add("W");
        list.add("A");
        list.add("R");
        list.add("U");
        list.add("P");
        
        Iterator itr = list.iterator();//for looping through collections
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

/*Output is 
S
W
A
R
U
P
*/
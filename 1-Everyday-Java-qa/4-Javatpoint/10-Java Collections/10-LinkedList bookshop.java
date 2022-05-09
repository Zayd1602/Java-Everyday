// LinkedList Bookshop

import java.util.*;
class Main{
    public static void main(String args[]){
        LinkedList<BookStore> list = new LinkedList<BookStore>();
        BookStore b1 = new BookStore("The theory of Everything",984838);
        BookStore b2 = new BookStore("Thinking in Numbers",9929850);
        list.add(b1);
        list.add(b2);
        
        for(BookStore b: list){
            System.out.println(b.bookname+" "+b.bookId);
        }
    }      
}

class BookStore{
    String bookname;
    int bookId;
    BookStore(String bookname,int bookId){
        this.bookname = bookname;
        this.bookId = bookId;
    }
}

/*
The theory of Everything 984838
Thinking in Numbers 9929850
*/

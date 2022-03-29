// User defined class objects in Java ArrayList

import java.util.*;
class Main{
    public static void main(String args[]){
        Student s1 = new Student(20,"Swarup",167);
        Student s2 = new Student(21,"Sukhyat",115);
        Student s3 = new Student(22,"Gullu",198);
        
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // System.out.println(list);
        
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Student st = (Student)itr.next();
            System.out.println(st.name+" "+st.age+" "+st.rollno);
        }
        
    }      
}


class Student{
    int age;
    String name;
    int rollno;
    Student(int age,String name,int rollno){
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }
}

/*
Output is 
Swarup 20 167
Sukhyat 21 115
Gullu 22 198
*/
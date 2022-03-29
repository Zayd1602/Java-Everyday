# Notes

### Collections 

- **Taking input a list using Scanner**
    - ```Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");
    
        while(scan.hasNextInt()){
             list.add(scan.nextInt());
        }
        ```

- **ArrayList**
    - uses a dynamic array to store the duplicate elements of different data types
    - maintains the insertion order
    - non synchronized
    - elements can be randomly accessed 
    - manipulation is a bit slower than LinkedList because a lot of shifting needs to occur if any element is removed.
    - We can't create an array list of the primitive types such as int, float, char etc..
        - ~ArrayList< int > list = new ArrayList< int >();~
        - ``` ArrayList<Integer> list = new ArrayList<Integer>();``` works well
    - ```ArrayList<String> list = new ArrayList<String>();```
    
    | Method | Description |
    | --- | --- |
    | ```void add(int index, E element)``` | inserting specified element at specific position|    
    | ```boolean add(E e)``` | append the specified element at the end of the list |
    | ```void clear()``` | remove all the elements from the this list |
    | ```boolean contains(Object o)``` | returns _True_ if the list contains the specified element |
    | ```E remove(int index)``` | used to remove the element present at the speicified position in the list |
    | ```int size()``` | returns the number of elements present in the list |
    | ```.retainAll()``` | removing all the arrsy list's elements that are not contained in the specified collection |

    - ArrayList<String> : here <String> type forces to have only 'string' type of object in it.
    - _Get and Set_ 
        - ```list.get(index_val)```: returns the element at the specified index
        - ```list.set(index_val,new_name)```: changes the element
    - _Sorting list_
        - ```Collections.sort(list_name)```

- **Iterate the elements of the collection**
    
    - ```Iterator itr = list.iterator();```: Iterator interface
    - ```for(String str: list){}```: for-each loop
    - ```list.ListIterator(list.size())```: ListIterator interface
    - ```for(inti=0;i < list.size();i++){}```: normal for loop
    - forEachRemaining(): 
    ```
    Iterator itr = list.iterator()
    itr.forEachRemaining(a->{})
    ```

---

- **LinkedList**
    - can store duplicate elements 
    - maintains the insertion order
    - not synchronized
    - manipulation is fast because no shifting is required
    - ``` LinkedList<String> list = new LinkedList<String>();```

- **QUEUE Interface**
    - maintains first in first out order
    - ordered list
    - can be instantiated as 
        - ```Queue<String> q1 = new PriorityQueue();```
        - ```Queue<String> q2 = new ArrayDeque();```
    - _.peek()_ : returns the element present at the front of the container.
    - _.remove()_ : removes the head
    - _.poll()_ : retrieve or fetch and remove the first element of the queue or remove the element having the highest priority.
    - **PriorityQueue**
        - every element has a certain priority.
        - only supports comparable data.
        - doesn't allow null values to be stored in the queue
        - ordered list
        - _Note_
            - Smaller numbers have higher priority than bigger numbers so they'll be removed first.
    - **Deque Interface**
        - we can remove and add elements from both the side
        - Stands for double ended queue which enables us to perform the operations at both the ends.
        - can be instantiated as 
            - ```Deque d = new ArrayDeque();```
        - ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.

- **Set Interface**
    - represents the unordered set of elements which doesn't allow us to store the duplicate items.
    - We can store at most one null value.
    - implemented by HashSet, LinkedHashSet and TreeSet
    - can be instantiated as
        - ```Set<data-type> s1 = new HashSet<data-type>();```
        - ```Set<data-type> s2 = new LinkedHashSet<data-type>();```
        - ```Set<data-type> s3 = new TreeSet<data-type>();```
    - **HashSet**
        - uses a hash table for storage.
        - Hashing is used to store the elements in the HashSet
        - contains unique items.

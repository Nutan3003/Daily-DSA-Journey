# Java:DSA Progress

1. [Bodmas Rule](#day1)
2. [Type Casting, Variables rules](#day2)
3. [Conditional Statement](#day3)
4. [Conditional Statement and operators](#day4)
5. [Break,Continue](#day5)
6. [For loop](day6)
7. [Functions:Part1](#day7)
8. [Functions:Part2](#day8)
9. [Time complexity](#day9)
10. [Arrays](#day10)
11. [2D-Arrays](#day11)
12. [String](#day12)
12. [Bit Manipulation](#day13)
13. [HashSet](#day14)
14. [Linked List](#Day15_Linkedlist)
15. [Stack](#Day16Stack)
16. [Queue](#Day17Queue)
17. [Heap](#Day18Heap)

## Day1: 
### Bodmas Rule
        >Bodmas Rule And precedence
        Rank1:Brackets:()[]{}
        Rank2: */  -------->Left to right
        Rank3: +-   -------->left to right
        Rank4: ^   --------->Right to left 

        >Different ways to print the output statement in java
        Rule1:Println() method will display the ouput in new line.It will 1st print and then go to the next line
        Rule2:Print() will print the output in same line

## Day2: 
### Type Casting, Variables rules
       >Type Casting
       Implicit (Automatic)  -------convert low range data into High
       Explict(Forced) --------convert high range to low range forcefully. 

       >Variables_rules
       Rules:1.Name can contain lowercase, uppercase 
       // digit ($)or(_)underscore

       Rule2:First letter of variable name can not be a number
       //int 1x=10;    //Valid

       Rule3:can not use reserve word as veriable name
       //For ex: int ,float,static,public 

## Day3:
### Conditional Statement
       Understand the various control structures in Java such as if-else statements, switch cases, loops (for, while, do-while), and break/continue statements.

## Day4:  
###   Conditional Statement and operators
           if  -----> if some conditon is true then only execute the code
           else ------> if the if condition is false then only it execute the else statement.

### problems
           1.Read the number and find the number is even or odd
           2.Reverse the number.

## Day5:
### Break,Continue

              - if given condition is found the it will break there
              -continue: if thie condition is correct the skip that condition only
### problems
            1.Factores of given number
            2.Given no. if prime or composite.

## Day6:
### For loop
### problems
         -Diamond Pattern
         -hollo Diamond
         -linestar
         -opposite triangle Pattern
         -triangle Pattern Number

## Day7:
### Functions:Part1
       If the two function having the same name if u changes in one function it can not reflect in another function
       You can have a no output of function then you have void return type of function.
### problems
      -Fact number
      -ncr :
      -npr:

## Day8:
### Functions:Part2
### problems
            -Fact :Optimized solutions
            -Prime number
            -Sum of natural numbers
            -Fibonocci Number

## Day9:
### Time complexity

## Day10:
### Arrays
### problems
            -Array Input
            -Array swap
            -Reverse Array
            -Rotate Array
            -Sum of array

## Day11:
### 2D-Arrays
           -Array list
            Syntax: ArrayList<Integer> arr=new ArrayList<Integer>();
### problems 
          -Array list
          -print column wise
          -print row wise
          -Print row zig 

## Day12:          
### String
          String is a built-in class available in java. 
          - A string is a collection of characters. 
          -Simplest method for creating a string is String str1=”Java 
          program”; 
          - Variable of type object are called as reference. 
          -String object is referred to as a literal. 
          - References are used for holding or pointing objects. 
          - String literal is taken in “ “. 
          - Keyword new is taken to create an object in heap. 
          - Constructors are methods or functions used for creating string 
object.

### String methods:
           -str.charAt(int index): to find the particular character present 
on the index given. 
             -toCharArray() : Convert String to char
             

### problems 
       -Toggle char
       -Is Palindrome
       -Reverse the string


## Day13:
### Bit Manipulation
                 -& (Bit wise and) ->If both are true then only it is true
                 -| (Bit wise or) ->If any one is true only it is true
                 -& (Bit wise x-or) ->If both are same then it is flase

                 -<< (Left shift)  =n*2^b
                 ->>(right shift)   =n/2^b
           
### problems  
               -Even odd
               -swap without thired variable
               -Finf Unique from array elements 

## Day14:
### HashSet And HashMap:
### HashMap
-Purpose: A HashMap is used to store key-value pairs, where each key is associated with a specific value.
Implementation: It implements the Map interface.
-Elements: It contains entries (key-value pairs). Each key is unique, but multiple keys can map to the same value.
-Null Values: It allows one null key and multiple null values.
-Performance: Provides constant-time performance for basic operations (get and put), assuming the hash function disperses elements properly among the buckets.

### HashSet

-Purpose: A HashSet is used to store a collection of unique elements. It does not allow duplicate elements.
-Implementation: It implements the Set interface and internally uses a HashMap to store the elements.
-Elements: It contains only values (no key-value pairs). The values are unique.
-Null Values: It allows one null value.
-Performance: Provides constant-time performance for basic operations (add, remove, contains), assuming the hash function disperses elements properly among the buckets.

## Day14:
### LinkedList


A **LinkedList** is a linear data structure where elements are stored in nodes, and each node contains a data part and a reference (or link) to the next node in the sequence. Unlike arrays, LinkedLists do not require a contiguous block of memory. LinkedLists are dynamic in size, meaning they can grow or shrink as elements are added or removed.

## Characteristics of LinkedList
- **Dynamic Size:** LinkedLists can easily grow and shrink in size without the need for reallocation of memory.
- **Insertion and Deletion:** Adding or removing elements is more efficient compared to arrays, as there is no need to shift elements.
- **Memory Utilization:** Memory is used efficiently since nodes are allocated dynamically.

## Types of LinkedLists
1. **Singly Linked List:** Each node contains data and a reference to the next node. Traversal is unidirectional (forward).
2. **Doubly Linked List:** Each node contains data, a reference to the next node, and a reference to the previous node, allowing traversal in both directions (forward and backward).
3. **Circular Linked List:** The last node points to the first node, forming a circular loop. It can be singly or doubly linked.

## LinkedList in Java Collections Framework
In Java, `LinkedList` is a class in the `java.util` package and implements the `List`, `Deque`, and `Queue` interfaces. This makes it a versatile data structure for operations involving lists, queues, and stacks.

## Common LinkedList Methods
- `boolean add(E e)`: Appends the specified element to the end of the list.
- `void addFirst(E e)`: Inserts the specified element at the beginning of the list.
- `void addLast(E e)`: Appends the specified element to the end of the list.
- `E removeFirst()`: Removes and returns the first element of the list.
- `E removeLast()`: Removes and returns the last element of the list.
- `E get(int index)`: Returns the element at the specified position in the list.
- `E getFirst()`: Retrieves the first element in the list.
- `E getLast()`: Retrieves the last element in the list.
- `boolean contains(Object o)`: Checks if the list contains the specified element.


## Day15:

 #### Stack

A **Stack** is a linear data structure that follows the **LIFO** (Last In, First Out) principle. This means that the last element added to the stack will be the first one to be removed.

## Key Characteristics of a Stack:

- **LIFO Principle**: The most recently added element is the first one to be removed.
- **Sequential Access**: Access is restricted to only one end of the stack, called the **top**.

### Operations:

- **Push**: Add an element to the top of the stack.
- **Pop**: Remove the top element from the stack.
- **Peek (or Top)**: Retrieve the value of the top element without removing it.
- **isEmpty**: Check whether the stack is empty.
- **isFull**: (For fixed-size stacks) Check if the stack is full.

### Stack Operations with Time Complexity:

- **Push**: Add an element to the top of the stack.  
  - Time Complexity: **O(1)**

- **Pop**: Remove the top element from the stack.  
  - Time Complexity: **O(1)**

- **Peek**: Retrieve the top element without modifying the stack.  
  - Time Complexity: **O(1)**

- **isEmpty**: Check if the stack contains any elements.  
  - Time Complexity: **O(1)**

- **isFull**: Check if the stack has reached its maximum capacity (for fixed-size stacks).  
  - Time Complexity: **O(1)**

## Example of Stack Usage:

Consider a stack of plates. When you add a new plate, you place it on top of the previous one, and when you remove a plate, you take the one from the top. This follows the LIFO rule: the last plate added is the first one to be removed.

## Day16:
### Queue in Java

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle, meaning that the element that is added first will be the first one to be removed. Queues are commonly used in scenarios where we need to handle data in the order it arrives, such as task scheduling, handling requests in a server, or managing printer jobs.

## Characteristics of Queue
- **Insertion (Enqueue):** Elements are added to the end of the queue.
- **Deletion (Dequeue):** Elements are removed from the front of the queue.
- Operations are performed in constant time **O(1)**.

## Types of Queues
1. **Simple Queue:** Follows the FIFO principle strictly.
2. **Circular Queue:** The last position is connected back to the first position to make a circular link.
3. **Priority Queue:** Elements are dequeued based on their priority, not their position in the queue.
4. **Deque (Double-ended Queue):** Allows insertion and deletion from both ends.

## Queue in Java Collections Framework
In Java, the `Queue` interface is available in the `java.util` package, and it extends the `Collection` interface. Some commonly used classes that implement the `Queue` interface are:
- `LinkedList`
- `PriorityQueue`
- `ArrayDeque`

## Common Queue Methods
- `boolean add(E e)`: Inserts the specified element into the queue (throws an exception if it fails).
- `boolean offer(E e)`: Inserts the specified element into the queue (returns `false` if it fails).
- `E remove()`: Removes and returns the head of the queue (throws an exception if the queue is empty).
- `E poll()`: Removes and returns the head of the queue (returns `null` if the queue is empty).
- `E element()`: Retrieves, but does not remove, the head of the queue (throws an exception if the queue is empty).
- `E peek()`: Retrieves, but does not remove, the head of the queue (returns `null` if the queue is empty).

## Day17:
### Heap


A **Heap** is a special tree-based data structure that satisfies the **Heap Property**. It is a complete binary tree where each node is ordered with respect to its children. The type of heap determines the order between parent and child nodes.

## Characteristics of Heap
- **Complete Binary Tree:** All levels of the tree are fully filled except possibly the last level, which is filled from left to right.
- **Heap Property:** In a heap, every parent node is either greater than or equal to (in a Max-Heap) or less than or equal to (in a Min-Heap) each of its child nodes.

## Types of Heaps
1. **Min-Heap:** The value of each parent node is less than or equal to the values of its children. The root node has the smallest value in the heap.
2. **Max-Heap:** The value of each parent node is greater than or equal to the values of its children. The root node has the largest value in the heap.

## Heap in Java Collections Framework
In Java, the `PriorityQueue` class is often used to implement a Heap. By default, `PriorityQueue` in Java implements a Min-Heap. To implement a Max-Heap, a custom comparator can be provided while creating the `PriorityQueue`.

## Common Heap Operations
- **Insertion:** Adding an element to the heap while maintaining the heap property. The time complexity is **O(log n)**.
- **Deletion (Remove Root):** Removing the root element (minimum in Min-Heap, maximum in Max-Heap) and re-arranging the heap to maintain its property. The time complexity is **O(log n)**.
- **Peek:** Retrieving the root element without removing it. The time complexity is **O(1)**.

## Example Code

```java
import java.util.PriorityQueue;

public class HeapExample {
    public static void main(String[] args) {
        // Creating a Min-Heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the Min-Heap
        minHeap.add(15);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(5);

        // Displaying the root element
        System.out.println("Root element (Min-Heap): " + minHeap.peek());

        // Removing the root element
        minHeap.poll();
        System.out.println("After removing root, Min-Heap: " + minHeap);
    }
}

        



          
           



       

              






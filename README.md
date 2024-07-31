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
12.  [Bit Manipulation](#day13)
13. [HashSet](#day14)

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

          




          
           



       

              






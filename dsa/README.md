# Data Structure and Algorithm (DSA)

Data structures and algorithms are the identity of a good programmer. They are a very important foundation of programming, so don't leave them out. You don't have to be the best and you don't have to know every data structure or algorithm, but you should have an overview.

## What is DSA?

Data structures and algorithms are the two things that will completely change your approach to programming.
Data structures help us store data in a specific format, and algorithms are nothing more than the process you implement to solve a specific problem.

## Why is DSA important?

DSA plays a very important role in reducing the time complexity of code. There can be multiple approaches to a problem, but you have to choose the optimal one to stand out from the crowd. You have to be able to write code that takes less time to execute for a given problem. You can do this by learning DSA. If you master DSA properly, you will be able to write better code.

</br>

# Topics to Study

- [Algorithmic complexity / Big-O / Asymptotic analysis](#algorithmic-complexity--big-o--asymptotic-analysis)

- [Data Structures](#data-structures)
  - [Array](#array)
  - [Linked List](#linked-list)
  - Stack
  - Queue
  - Hash Table
  - Binary Tree
  - Binary Search Tree
  - Heap 
  - Graph
  - Matrix
  - Misc
  - Advanced Data Structures

- Algorithms

</br>
</br>

# Let's Get Started
<!---
Text here maybe motivation or so
--->

</br>
</br>

# Algorithmic complexity / Big-O / Asymptotic analysis

Before we get into DSA, let's first have a look at Big-O.

I have left you a few videos that you can use to learn. Watch as many as you want until you understand everything. If you don't understand everything right away, it doesn't matter, you can always come back and watch everything again in detail.

<br />

- [ ] [Hackerrank Basics of Big-O](https://www.youtube.com/watch?v=v4cd1O4zkGw)
- [ ] [Introduction to Big O Notation and Time Complexity by CS Dojo](https://www.youtube.com/watch?v=D6xkbGLQesk)
- [ ] [Havard Asymptotic Notation](https://www.youtube.com/watch?v=iOq5kSKqeR4)
- [ ] [UC Berkeley Big O](https://archive.org/details/ucberkeley_webcast_VIS4YDpuP98)

<br />

As programmers, we often find ourselves asking the same two questions over and over agian:
- How much time does this alogrithm need to finish?
  </br>
   and
- How much space does this algorithm need for its computation?
  
With Big-O Notation we can get an idea of the complexity of our algorithms

<br />

**Constant Time: O(1)**

O(1) means that it takes a constant time to run an algorithm, regardless of the size of the input.

Examples:
- math operations
- accessing array via the index
- returning a value from a funtion 

<br />

**Logarithmic Time: O(log n)**

O(log n) means that the runtime grows in proportion to the logarithm of the input size, e.g., if 10 items take a time of x, then 100 items take a time of 2x and 10,000 items take a time of 4x. Algorithms that run in logarithmic time have a large impact when dealing with larger inputs.

Example: 
```
   for (int i = 1; i <=n; i *= 2) {
       // some O(1) expressions
   }
   for (int i = n; i > 0; i /= 2) {
       // some O(1) expressions
   }
```
</br>

**Linear Time: O(n)**

O(n) means that the runtime increases at the same rate as the input.

Example: 
```
   for (int i = 1; i <= c; i++) {  
        // some O(1) expressions
   }
```
<br />

**Quadratic Time: O($n^2$)**

O(n²) means that the calculation runs in quadratic time, which corresponds to the squared size of the input data.

Example: 
```
      for (int i = 1; i <= n; i += 1) {  
        // some O(1) expressions
   }

   for (int i = n; i > 0; i -= 1) {
        // some O(1) expressions
   }
```


<br />


Above I have now shown you only the most important on the picture you can see the remaining

</br>

<img width="500" height="auto" src="../assets/Big_O.jpg" alt="Silicon Valley Bighead"/>


<br />
<br />
<br />

# Data Structures

## What is a Data Structure? 

A data structure (DS) is a way of organizing data so that it can be used effectively

## Why we need them?

- They are essantial ingredients in creating fasr and powerful alogrithms
- They help to manage and organize data
- They make code cleaner and easier to understand

---

## Array

There are two types of arrays static and dynamic let's start with the static ones first

</br>

A static array is a fixed length container that can contain n elements that are indexable. The index of an array always starts at 0 and goes to the n-1th element, because we have to count the 0.

If you are wondering what indexable means.

This means that each slot/index in the array can be referenced with a number.

### When and where is a static Array used?

Array are used everywhere. We use them to: 
- store and accessing sequential data
- temporarily storing objects
- return multiple values from a function/method

</br>

### Complexity 

|              | Static       | Dynamic
| -----------  | -----------  | ----------- |
| Access       | O(1)         |O(1)         |
| Search       | O(n)         | O(n)        |
| Insertion    | N/A          | O(n)        |
| Appending    | N/A          | O(1)        |
| Deletion     | N/A          | O(n)        |

</br>

<img alt="static array image" width="auto" height="150" src="../assets/static-array.jpg" />

In this image we see an array named A. All elements of A are referenced by their index. Array indexing is based on zero, which means that the first element is found at position zero. So keep in mind to count the zero when you work with arrays.

Lets accessing some elements from our array.

```
A[0] = 44
A[1] = 12
A[8] = 100
```

If we now want to change a element in the Array, than we can do this also by indexing.

```
A[0] = 1;    // A[0] has now the value 1
```

Now lets move on dynamic Arrays

A dynamic array is also a container that can contain n elements that are indexable, but the difference with static arrays is that the size of a dynamic array can change at runtime. This means that a dynamic array does not have a fixed size, but can shrink and grow. 

Other differences are that we can
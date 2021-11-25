# Algorithms Ex1

### 1) Let A = (A[1],...,A[n]) be an n sized  array. **Reveresed order** in A is two indexes (i,j) so that i<j but A[i]>A[j].

---
#### Example:
    Input:
    int[] arr = (10,30,50,40,20)
    
    Output:
    4

'arr' has 4 Reversed orders: (2,5),(3,4)(3,5),(4,5)

Write an algorithm that receive array A and returns the amount of Reversed Orders within and has Time Complexity of O(n*log(n)).

*Hint : Write an algorithm that returns the amount of reversed orders in A and sort it as well. use [Divide and conquer](https://en.wikipedia.org/wiki/Divide-and-conquer_algorithm) method* 


---
### 2) Let A,B matrices NxN sized and let C=AB its multiplication.
A) What is the running time of the simple algorithm to calculate C (the definition of matrices multiplication)?

B) We write an algorithm more efficient for matrices multiplication using [Divide and conquer](https://en.wikipedia.org/wiki/Divide-and-conquer_algorithm) method. Therefore, we divide each of A,B,C into 4 matrices N/2*N/2:

![](https://imgur.com/uUybSQP.png)

* Express every one of N,P,Q,R using E,F,G,H,J,K,L,M
* How many recursive calls of matrice N/2*N/2 we will have to do if we act according to the previous section? What will be the running time of the recursive algorithm that way?
* We define: 

![](https://imgur.com/ZRTzt1G.png)

Express each of N,P,Q,R using Addition and Subtraction of matrices out of X1,...,X7. What will be the Time Complexity of the Matrice Multiplication Algorithm using X1,...,X7? 
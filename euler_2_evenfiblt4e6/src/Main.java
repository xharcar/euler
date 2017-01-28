/**
 * @author Matej Harcar, 422714@mail.muni.cz
 */
/*
Euler Project Problem #2:
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class Main {

    public static void main(String[] args) {
	    long result=0;
        int x1=0, x2=1, z=0, i=0;// assuming fibonacci(0)=0
        while(z<=4000000){
            z=x1+x2;
            System.out.println("fib(" + i + ") = " + z);
            i++;
            x1=x2;
            x2=z;
            if(z%2==0) result+=z;
        }
        System.out.println("result = " + result);
    }
}

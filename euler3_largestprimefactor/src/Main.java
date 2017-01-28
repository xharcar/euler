import java.util.ArrayList;

/**
 * @author Matej Harcar, 422714@mail.muni.cz
 */
/*
Euler Project Problem #3:
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/
public class Main {

    public static void main(String[] args) {
        PrimeTester primeTester = new PrimeTester();
        Long num = new Long("600851475143"); // 600'851'475'143 vs 2'147'483'647... fits in 64b long
        // 6e11... sqrt should be > 7e5 but <4e6 (7e5^2 = 4.9e11, close); not too big a range
        long sqrt_apx = 700000;
        for(;sqrt_apx<num;sqrt_apx++){
            if(sqrt_apx*sqrt_apx>num) break;
        }
        sqrt_apx--; // now we have a close-enough square root up to which we can test primes
        for(long i=23;i<sqrt_apx;i++){
            primeTester.testPrime(i);
        }
        ArrayList<Long> primelist = new ArrayList<>(primeTester.getPrimeset());
        long c; // will hold largest prime factor
        for(int i=primelist.size()-1;;i--){ // we're bound to find one before we get to 2 unless the number itself is prime
            c = primelist.get(i);
            if((num%c==0)) break;
        }
        System.out.println("Largest prime factor of 600851475143 is " + c);
    }



}


import java.util.HashSet;

/**
 * Created by Matej on 2017-01-28.
 */
public class PrimeTester {

    private HashSet<Long> primeset;

    public HashSet<Long> getPrimeset() {
        return primeset;
    }

    public PrimeTester(){
        primeset = new HashSet<>();
        addPrimes();
    }

    /**
     * Tests whether a number is prime
     * @param x tested number
     * @return true if x is prime
     */
    public boolean testPrime(long x){
        for(long p: primeset){
            if(p*p>x) {
                primeset.add(x); // x is prime if it's not divisible by any prime p<=sqrt(x)
                return true;
            }
            if(x%p==0) return false;
        }
        return true;
    }

    /**
     * Adds primes <20 to the list for an easy start
     */
    private void addPrimes(){
        primeset.add((long) 2);primeset.add((long) 3);primeset.add((long) 5);primeset.add((long) 7);primeset.add((long) 11);
        primeset.add((long) 13);primeset.add((long) 17);primeset.add((long) 19);
    }
}

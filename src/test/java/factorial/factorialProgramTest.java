package factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class factorialProgramTest {
    @Test
    void factorialOfZeroIsOne(){
        factorialProgram fact = new factorialProgram();
        long expected=fact.calculateFactorial(0);
        assertEquals(expected,1);
    }
    @Test
    void factorialOfOneIsOne(){
        factorialProgram fact = new factorialProgram();
        long expected=fact.calculateFactorial(1);
        assertEquals(expected,1);
    }
    @Test
    void factorialOfSmallerNumber(){
        factorialProgram fact = new factorialProgram();
        long expected=fact.calculateFactorial(5);
        assertEquals(expected,120);
    }
    @Test
    void factorialOfLargerNumber(){
        factorialProgram fact = new factorialProgram();
        long expected=fact.calculateFactorial(15);
        assertEquals(expected,1307674368000L);
    }
    @Test
    void factorialOfBiggerNumber(){
        factorialProgram fact = new factorialProgram();
        long expected=fact.calculateFactorial(20);
        assertEquals(expected,2432902008176640000L);
    }
}
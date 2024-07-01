package org.example;

/**
 * App!
 * Collatz Conjecture
 *  f(x) where: if x is even, divide by 2, if x is odd, multiply x by 3 and add 1;
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();

        System.out.println( "Run computeEquation!" );
        System.out.println( Integer.MIN_VALUE );

        app.computeEquation(7);
    }

    int computeEquation(int x) {
        // if x is even,
        //     x = divide x by 2;
        // if x is odd,
        //     x = 3 * x + 1;
        if (x % 2 == 0) {
            x = x / 2;
        } else {
            x = (x * 3) + 1;
        }
        return x;
    }
}

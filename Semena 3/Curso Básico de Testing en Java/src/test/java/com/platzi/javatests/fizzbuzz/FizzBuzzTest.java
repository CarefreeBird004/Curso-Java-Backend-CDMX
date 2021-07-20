
package com.platzi.javatests.fizzbuzz;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzBuzz_tests6(){
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
    }
    @Test
    public void fizzBuzz_tests3(){
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
    }
    @Test
    public void fizzBuzz_tests5(){
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
    }
    @Test
    public void fizzBuzz_tests15(){
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
    }


}
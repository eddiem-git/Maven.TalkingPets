package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest(){
        //Given
        Dog rocky = new Dog(null,null);
        String expected = "Ruff";

        //When
        String actual = rocky.speak();

        //Then

        Assert.assertEquals(expected, actual);
    }
}
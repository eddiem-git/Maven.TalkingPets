package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void speakTest(){
        //Given
        Bird falcon = new Bird(null,null);
        String expected = "Caaw";

        //When
        String actual = falcon.speak();

        //Then

        Assert.assertEquals(expected, actual);
    }
}
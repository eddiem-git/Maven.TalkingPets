package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void speakTest(){
        //Given
        Cat cat = new Cat(null,null);
        String expected = "Meow";

        //When
        String actual = cat.speak();

        //Then

        Assert.assertEquals(expected, actual);
    }
}
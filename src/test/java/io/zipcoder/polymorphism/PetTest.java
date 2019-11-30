package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void getNameTest() {
        //Given
        Pets pet = new Pets("Winnie",null);
        String expected = "Winnie";
        //When
        String actual = pet.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        //Given
        Pets pet = new Pets(null, "Pitbull");
        String expected = "Johnathan";

        //When
        pet.setName("Johnathan");

        //Then
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest() {
        //Given
       Pets pet = new Pets(null,"Dog");
       String expected = "Dog";
        //When
        String actual = pet.getType();

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTypeTest() {
        //Given
        Pets pet = new Pets(null,null);
        String expected = "Dog";
        //When
        pet.setType("Dog");
        //Then
        String actual = pet.getType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest(){
        //Given
        Pets pet = new Pets("Johnathan", "Pitbull");
        String expected = "Pets{name='Johnathan', type='Pitbull'}";

        //When
        String actual = pet.toString();

        //Then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        //Given
        Pets pet = new Pets("Johnathan", "Pitbull");
        String expected = "huh?";

        //When
        String actual = pet.speak();

        //Then

        Assert.assertEquals(expected, actual);
    }
}

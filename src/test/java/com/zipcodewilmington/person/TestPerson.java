package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Bob Marley";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 35;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 35;
        String expectedName = "Bob Marley";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAllFields() {
        // Given
        Integer expectedAge = 35;
        String expectedName = "Bob Marley";
        Double expectedWeight = 150.0;
        String expectedBloodDonor = "Y";
        String expectedGender = "M";

        // When
        Person person = new Person();

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        Double actualWeight = person.getWeight();
        String actualGender = person.getGender();
        String actualBloodDonor = person.getBloodDonor();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedBloodDonor, actualBloodDonor);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Bob Marley";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 35;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Double expected = 150.0;

        // When
        person.setWeight(expected);

        // Then
        Double actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "M";

        // When
        person.setGender(expected);

        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBloodDonor() {
        // Given
        Person person = new Person();
        String expected = "Y";

        // When
        person.setBloodDonor(expected);

        // Then
        String actual = person.getBloodDonor();
        Assert.assertEquals(expected, actual);
    }

}

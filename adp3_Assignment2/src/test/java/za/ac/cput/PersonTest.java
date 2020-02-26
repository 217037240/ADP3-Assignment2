package za.ac.cput;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

//for Testing Object Identity & Ignore Test
public class PersonTest {

    private String name, surname;
    Person person = new Person();


    @Before
    public void setUp() throws Exception {
        name = person.name("John");
        surname = person.surname("Wick");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void name() {
        String nameString = "John";
        assertSame(nameString, name);
    }

    @Test
    public void surname() {
        String surNameString = "Wick";
        assertSame(surNameString, surname);
    }

    @Test
    public void testIdentity(){
        assertSame(name, name);
    }

    @Test
    public void testIdentity3(){
        assertNotSame(name, surname);
    }

    @Ignore
    @Test
    public void ignoreTest(){
        assertEquals(name, name);
    }
}
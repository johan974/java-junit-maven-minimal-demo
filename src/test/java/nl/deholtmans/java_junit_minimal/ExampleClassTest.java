package nl.deholtmans.java_junit_minimal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleClassTest {
    @Test
    public void testPrintHelloWorld() {
        ExampleClass exampleClass = new ExampleClass();
        Assert.assertEquals(exampleClass.getHelloWorld(), "Hello World");
    }
    @Test
    public void testPrintHelloWorld2() {
        ExampleClass exampleClass = new ExampleClass();
        Assert.assertEquals(exampleClass.getHelloWorld2(), "Hello World 2");
    }
}
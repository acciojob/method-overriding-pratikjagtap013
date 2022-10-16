package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    private A a = new A();
    private B b = new B();

    @Test
    public final void testprintHelloWorld() {
        assertEquals("Invoking method from class A", a.meth());
    }

    @Test
    public final void testprintHelloWorld2() {
        assertEquals("Method is overridden in Extendend class B", b.meth());
    }

}

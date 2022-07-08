package com.example.servicos;

import com.example.entidades.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void test() {
        assertTrue(true);
        assertFalse(false);

        assertEquals(1, 1);
        assertEquals(0.17886, 0.178862333, 0.00001);
        assertEquals(Math.PI, 3.14, 0.01);

        int i = 5;
        Integer j = 5;
        assertEquals(Integer.valueOf(i), j);
        assertEquals(i, j.intValue());

        assertEquals("bola", "bola");
        assertNotEquals("bola", "casa");
        assertTrue("bola".equalsIgnoreCase("Bola"));
        assertTrue("bola".startsWith("bo"));

        Usuario u1 = new Usuario("Usuario 1");
        Usuario u2 = new Usuario("Usuario 1");
        Usuario u3 = u2;
        Usuario u4 = null;

        assertEquals(u1, u2);
        assertSame(u2, u3);
        assertNotSame(u1, u2);
        assertNull(u4);
        assertNotNull(u2);
    }
}

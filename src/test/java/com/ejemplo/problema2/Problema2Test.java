package com.ejemplo.problema2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.ejemplo.problema2.problema2.Cliente;

public class Problema2Test {

    @Test
    public void testCaso1() {
        Cliente cliente = new Cliente(-30, true, true, true);
        // Asserts esperados para Caso 1
        assertNotNull(cliente);
        // Añade más asserts según la lógica de Cliente
    }

    @Test
    public void testCaso2() {
        Cliente cliente = new Cliente(-30, false, false, false);
        // Asserts esperados para Caso 2
        assertNotNull(cliente);
    }

    @Test
    public void testCaso3() {
        Cliente cliente = new Cliente(15, true, false, true);
        // Asserts esperados para Caso 3
        assertNotNull(cliente);
    }

    @Test
    public void testCaso4() {
        Cliente cliente = new Cliente(15, false, true, false);
        // Asserts esperados para Caso 4
        assertNotNull(cliente);
    }

    @Test
    public void testCaso5() {
        Cliente cliente = new Cliente(19, true, true, false);
        // Asserts esperados para Caso 5
        assertNotNull(cliente);
    }

    @Test
    public void testCaso6() {
        Cliente cliente = new Cliente(19, false, false, true);
        // Asserts esperados para Caso 6
        assertNotNull(cliente);
    }

    @Test
    public void testCaso7() {
        Cliente cliente = new Cliente(45, true, false, false);
        // Asserts esperados para Caso 7
        assertNotNull(cliente);
    }

    @Test
    public void testCaso8() {
        Cliente cliente = new Cliente(45, false, true, true);
        // Asserts esperados para Caso 8
        assertNotNull(cliente);
    }

    @Test
    public void testCaso9() {
        Cliente cliente = new Cliente(-30, true, false, true);
        // Asserts esperados para Caso 9
        assertNotNull(cliente);
    }

    @Test
    public void testCaso10() {
        Cliente cliente = new Cliente(-30, false, true, false);
        // Asserts esperados para Caso 10
        assertNotNull(cliente);
    }

    @Test
    public void testCaso11() {
        Cliente cliente = new Cliente(15, true, true, false);
        // Asserts esperados para Caso 11
        assertNotNull(cliente);
    }

    @Test
    public void testCaso12() {
        Cliente cliente = new Cliente(15, false, false, true);
        // Asserts esperados para Caso 12
        assertNotNull(cliente);
    }

    @Test
    public void testCaso13() {
        Cliente cliente = new Cliente(19, true, false, true);
        // Asserts esperados para Caso 13
        assertNotNull(cliente);
    }

    @Test
    public void testCaso14() {
        Cliente cliente = new Cliente(19, false, true, false);
        // Asserts esperados para Caso 14
        assertNotNull(cliente);
    }

    @Test
    public void testCaso15() {
        Cliente cliente = new Cliente(45, true, true, false);
        // Asserts esperados para Caso 15
        assertNotNull(cliente);
    }

    @Test
    public void testCaso16() {
        Cliente cliente = new Cliente(45, false, false, true);
        // Asserts esperados para Caso 16
        assertNotNull(cliente);
    }

    @Test
    public void testCaso17() {
        Cliente cliente = new Cliente(-30, true, true, false);
        // Asserts esperados para Caso 17
        assertNotNull(cliente);
    }

    @Test
    public void testCaso18() {
        Cliente cliente = new Cliente(-30, false, false, true);
        // Asserts esperados para Caso 18
        assertNotNull(cliente);
    }

    @Test
    public void testCaso19() {
        Cliente cliente = new Cliente(15, true, false, false);
        // Asserts esperados para Caso 19
        assertNotNull(cliente);
    }

    @Test
    public void testCaso20() {
        Cliente cliente = new Cliente(15, false, true, true);
        // Asserts esperados para Caso 20
        assertNotNull(cliente);
    }

    @Test
    public void testCaso21() {
        Cliente cliente = new Cliente(19, true, true, true);
        // Asserts esperados para Caso 21
        assertNotNull(cliente);
    }

    @Test
    public void testCaso22() {
        Cliente cliente = new Cliente(19, false, false, false);
        // Asserts esperados para Caso 22
        assertNotNull(cliente);
    }

    @Test
    public void testCaso23() {
        Cliente cliente = new Cliente(45, true, false, true);
        // Asserts esperados para Caso 23
        assertNotNull(cliente);
    }

    @Test
    public void testCaso24() {
        Cliente cliente = new Cliente(45, false, true, false);
        // Asserts esperados para Caso 24
        assertNotNull(cliente);
    }

    @Test
    public void testCaso25() {
        Cliente cliente = new Cliente(-30, true, false, false);
        // Asserts esperados para Caso 25
        assertNotNull(cliente);
    }

    @Test
    public void testCaso26() {
        Cliente cliente = new Cliente(-30, false, true, true);
        // Asserts esperados para Caso 26
        assertNotNull(cliente);
    }
}

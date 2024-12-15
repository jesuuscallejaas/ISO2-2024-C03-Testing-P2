package com.ejemplo.problema2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.ejemplo.problema2.problema2.Cliente;

public class Problema2Test {


	@Test
    public void testCaso1_EdadNegativa() {
        Cliente cliente = new Cliente(-30, true, true, true);  // Edad negativa
        assertEquals("Sin tipo de cuenta disponible", problema2.determinarTipoCuenta(cliente));
    }

	    @Test
	    public void testCaso2_SinCuentaDisponible() {
	        Cliente cliente = new Cliente(15, true, false, false);
	        assertEquals("Sin tipo de cuenta disponible", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso3_CuentaAhorraAhoraQuePuedes() {
	        Cliente cliente = new Cliente(19, false, true, true);
	        assertEquals("Cuenta Ahorra ahora que puedes", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso4_SinCuentaDisponible() {
	        Cliente cliente = new Cliente(45, false, false, false);
	        assertEquals("Sin tipo de cuenta disponible", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso5_SinCuentaDisponible() {
	        Cliente cliente = new Cliente(1, false, true, true);
	        assertEquals("Sin tipo de cuenta disponible", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso6_CuentaSaltandoDelNido() {
	        Cliente cliente = new Cliente(18, false, false, true);
	        assertEquals("Cuenta Saltando del Nido", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso7_SinCuentaDisponible() {
	        Cliente cliente = new Cliente(17, true, false, false);
	        assertEquals("Sin tipo de cuenta disponible", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso8_CuentaAhorraAhoraQuePuedes() {
	        Cliente cliente = new Cliente(18, false, true, true);
	        assertEquals("Cuenta Ahorra ahora que puedes", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso9_CuentaVamosQueTuPuedes() {
	        Cliente cliente = new Cliente(24, true, false, false);
	        assertEquals("Cuenta Vamos que tú puedes", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso10_CuentaAhorraAhoraQuePuedes() {
	        Cliente cliente = new Cliente(25, false, true, true);
	        assertEquals("Cuenta Ahorra ahora que puedes", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso11_SinCuentaDisponible() {
	        Cliente cliente = new Cliente(26, true, false, false);
	        assertEquals("Sin tipo de cuenta disponible", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso12_CuentaIndependizate() {
	        Cliente cliente = new Cliente(30, false, true, true);
	        assertEquals("Cuenta Independízate que va siendo hora", problema2.determinarTipoCuenta(cliente));
	    }

	    @Test
	    public void testCaso13_SinCuentaDisponible() {
	        Cliente cliente = new Cliente(19, true, true, false);
	        assertEquals("Sin tipo de cuenta disponible", problema2.determinarTipoCuenta(cliente));
	    }
}

package com.mycompany.cuenta.bancaria.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yeferson
 */
public class CuentaBancariaTest {

    public CuentaBancariaTest() {
    }

    /**
     * Test of getTitular method, of class CuentaBancaria.
     */
    
    @Test
    public void testObtenerTitular() {
        String titularEsperado = "Carlos";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Carlos");
        String titularActual = cuenta.getTitular();
        assertEquals(titularEsperado, titularActual);
    }
    
    @Test
    public void testObtenerTitularAlternativo() {
        String titularEsperado = "Ana";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Ana");
        String titularActual = cuenta.getTitular();
        assertEquals(titularEsperado, titularActual);
    }
    
    @Test
    public void testObtenerNumeroCuenta() {
        String numeroCuentaEsperado = "7890XYZ";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNumeroCuenta("7890XYZ");
        String numeroCuentaActual = cuenta.getNumeroCuenta();
        assertEquals(numeroCuentaEsperado, numeroCuentaActual); 
    }
    
    @Test
    public void testObtenerNumeroCuentaAlternativo() {
        String numeroCuentaEsperado = "123456789A";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNumeroCuenta("123456789A");
        String numeroCuentaActual = cuenta.getNumeroCuenta();
        assertEquals(numeroCuentaEsperado, numeroCuentaActual);
    }
    
    @Test
    public void testObtenerSaldo() {
        double saldoEsperado = 10.0;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(10.0);
        double saldoActual = cuenta.getSaldo();
        assertEquals(saldoEsperado, saldoActual);
    }
    
    @Test
    public void testObtenerSaldoAlternativo() {
        double saldoEsperado = 1000.0;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(1000.0);
        double saldoActual = cuenta.getSaldo();
        assertEquals(saldoEsperado, saldoActual);
    }
    
    @Test
    public void testRetirar() {
        double saldoEsperado = 5000.0 - 200.0;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(5000.0);
        double saldoActual = cuenta.retirar(200.0);
        assertEquals(saldoEsperado, saldoActual);
    }
    
    @Test
    public void testRetirarAlternativo() {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(50.0);
        double saldoActual = cuenta.retirar(100.0);
        assertEquals(0.0, saldoActual);
    }
    
    @Test
    public void testCalcularInteres() {
        double interesEsperado = 100.0 * 0.015;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(100.0);
        double interesActual = cuenta.calcularInteres();
        assertEquals(interesEsperado, interesActual);
    }
    
    @Test
    public void testCalcularInteresAlternativo() {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(-100.0);
        double interesActual = cuenta.calcularInteres();
        assertEquals(0.0, interesActual);
    }
    
    @Test
    public void testEstablecerTipoInteres() {
        CuentaBancaria cuenta = new CuentaBancaria();
        double tipoInteresEsperado = 0.08;
        cuenta.setTipoInteres(0.08);
        double tipoInteresActual = cuenta.getTipoInteres();
        assertEquals(tipoInteresEsperado, tipoInteresActual);
    }
    
    @Test
    public void testEstablecerTipoInteresAlternativo() {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTipoInteres(-0.05);
        double tipoInteresActual = cuenta.getTipoInteres();
        assertEquals(0.015, tipoInteresActual);
    }
}

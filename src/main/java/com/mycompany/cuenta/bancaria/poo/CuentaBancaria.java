package com.mycompany.cuenta.bancaria.poo;

public class CuentaBancaria {
    String titular;
    String numeroCuenta;
    double saldo;
    double tipoInteres;
    
    
    
    // TODO: Aquí va el código de la clase CuentaBancaria
    

    
    public CuentaBancaria(String titular, String numeroCuenta, double saldo, double tipoInteres) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoInteres = this.tipoInteres;
    }

    
    public CuentaBancaria() {
        this.saldo = 0.0;
        this.tipoInteres = 0.015;  // Valor predeterminado para el interés (1.5%)
    }

    

   

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
   

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
       
        this.saldo += this.saldo;
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }
    

    
    

    public void setTipoInteres(double tipoInteres) {
        if(tipoInteres>=0 && tipoInteres<= 0.1){
            this.tipoInteres = tipoInteres;
        }
        System.out.println("Interes invalido");
        
        
    }
    
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.out.println("Cantidad inválida para ingresar.");
        }
    }

    public double retirar(double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            return this.saldo -= cantidad;
        } else {
            System.out.println("Cantidad inválida para retirar o saldo insuficiente.");
            return 0;
            
        }
        
        
    }

    public double calcularInteres() {
        
      
        if (this.saldo >= 0 ){
            return this.saldo * this.tipoInteres;
        } else {
            System.out.println("Cantidad inválida para calcular interes.");
            return 0;
        }
        
        
    }
    
    
}

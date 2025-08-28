package com.github.andres.ejercicio1.models;

public class CuentaBancaria {
    private String titular;
    private Double saldo;

    public CuentaBancaria(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }
    public void retirar(double valorRetiro) {
        this.saldo -= valorRetiro;
    }

    public String mostrarInfoBancaria(){
        return "Cuenta Bancaria\nTitular: " + this.titular + "\nSaldo: " + this.saldo + "\n";
    }
}

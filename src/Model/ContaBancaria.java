package Model;

import javax.swing.JOptionPane;

public class ContaBancaria {
    public int numeroConta;
    public String nome;
    public double saldo;

    public ContaBancaria() {
        JOptionPane.showMessageDialog(null,"Vamos cadastrar sua Conta!");
        numeroConta = Integer.parseInt(JOptionPane.showInputDialog("insira o número da conta: "));
        nome = JOptionPane.showInputDialog("Insira seu nome: ");
    }

    public double realizaDeposito(double valor){
        saldo += valor;
        return saldo;
    }

    public double realizaSaque(double valor){
        saldo -= valor;
        return saldo;
    }
}
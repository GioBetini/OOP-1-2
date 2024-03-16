package View;

import javax.swing.JOptionPane;

import Model.ContaBancaria;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria();
        double valor = 150;
        double valorSaque = valor/2;
        JOptionPane.showMessageDialog(null,"Após o depósito seu saldo é de: R$"+conta.realizaDeposito(valor));
        JOptionPane.showMessageDialog(null,"Após o saque seu saldo é de: R$"+conta.realizaSaque(valorSaque));
    }
}

package src;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000);
        cc.depositar(5000);
        System.out.println("o saldo da conta corrente é " + cc.getSaldo());
        System.out.println("--------------------------------------------");



        ContaSalario cs = new ContaSalario(1250);
        cs.depositar(5000);
        cs.sacar(450);
        System.out.println("O saldo da conta salario é: " + cs.getSaldo());
        System.out.println("--------------------------------------------");



        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(198);
        cp.sacar(100);
        System.out.println("O saldo da conta salario é: " + cp.getSaldo());

    }
}

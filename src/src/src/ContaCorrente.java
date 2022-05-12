package src;

public class ContaCorrente extends Conta {
    private double valorChequeEspecial;

    public ContaCorrente( double valorInicialChequeEspecial){
        this.valorChequeEspecial = valorInicialChequeEspecial;

    }

    @Override
    public double sacar(double valor) {
        System.out.println("Valor a sacar " + valor);
        if (valor >= (getSaldo() + valorChequeEspecial)) {
            setSaldo(getSaldo() + valorChequeEspecial - valor);
            System.out.println("Valor Atual " + getSaldo());

            if (getSaldo() < 0) {
                System.out.println("Valor restante do Cheque Especial " + getValorChequeEspecial());
            }
            return valor;
        } else {
            System.out.println("Voce não tem valor disponivel para saque, valor disponivel: " + getValorChequeEspecial());
        }
        return 0.0;
    }

    @Override
    public double depositar(double valor) {
        System.out.println("Depositando " + valor);
        setSaldo(getSaldo() + valor);
        System.out.println("Saldo Atual" + getSaldo());
        return valor;
    }

    public double getValorChequeEspecial() {
        return valorChequeEspecial;
    }

    public void setValorChequeEspecial(double valorChequeEspecial) {
        this.valorChequeEspecial = valorChequeEspecial;
    }
}
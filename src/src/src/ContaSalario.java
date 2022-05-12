package src;

public class ContaSalario extends Conta{
    private int limiteDeSaque;

    public ContaSalario(int limiteDeSaque){
        this.limiteDeSaque = limiteDeSaque;
    }

    @Override
    public double sacar(double valor) {
        if (limiteDeSaque > 0){
            setSaldo(getSaldo() - valor);
            limiteDeSaque--;
        }
        return valor;
    }

    @Override
    public double depositar(double valor) {
        setSaldo(getSaldo() + valor);
        return valor;
    }
}

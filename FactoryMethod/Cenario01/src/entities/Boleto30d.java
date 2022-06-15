package entities;

public class Boleto30d extends Boleto {

    public Boleto30d(double valor) {
        super(valor);
        this.juros = 0.05;
        this.desconto = 0.05;
        this.multa = 0.1;
    }
}

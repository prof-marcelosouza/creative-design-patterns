package entities;

public abstract class Boleto {

    protected double valor;
    protected double juros;
    protected double desconto;
    protected double multa;

    public Boleto(double valor) {
        this.valor = valor;
    }

    public double calcularJuro() {
        return this.valor * this.juros;
    }

    public double calcularDesconto() {
        return this.valor * this.desconto;
    }

    public double calcularMulta() {
        return this.valor * this.multa;
    }
}

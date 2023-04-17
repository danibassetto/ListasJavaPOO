package L5_E3;

public class Conta {
    private int numero;
    private String tipo;
    private float saldo;

    public Conta(int numero, String tipo, float saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else return false;
    }

    public boolean tranferir(float valor, Conta destino) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        } else return false;
    }
}
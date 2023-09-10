public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldo) {
        this.saldo = saldo;
    }

    public void realizarSaque(double quantidade) {
        if (this.saldo < quantidade) {
            System.out.println("Saldo indisponível");
        } else {
            this.saldo = this.saldo - quantidade;
            System.out.println("Novo saldo: " + this.saldo);
        }

    }

}

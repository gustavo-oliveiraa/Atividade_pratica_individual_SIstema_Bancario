import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Loja> lojas;

    public Banco() {
        this.lojas = new ArrayList<>();
    }

    public synchronized void realizarTransacao(Cliente cliente,String nome, double valor, Loja loja) {
        cliente.getConta().saque(valor);
        loja.getConta().depositar(valor);
        System.out.println("-----");
        System.out.println(nome + " realizou compra no(a) " + loja.getNome() + ": " + "R$" + valor);
    }

    public synchronized void SaldoFinalLoja() {
        for (Loja loja : lojas) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Saldo do(a) "+ loja.getNome() +  " com desconto do salário do(s) funcionário(s)" + ": " + "R$" + loja.getConta().getSaldo());
        }
    }

    public void definirLoja(List<Loja> lojas) {
        this.lojas = lojas;
    }
}
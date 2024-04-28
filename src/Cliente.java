import java.util.List;
import java.util.Random;

public class Cliente extends Thread{

    private String nome;
    private Conta conta;
    private List<Loja> lojas;
    private Object semaforo;

    public Cliente(String nome, Banco banco, Loja loja1, Loja loja2, Object semaforo) {
        this.nome = nome;
        this.conta = new Conta(banco, 1000.0);
        this.lojas = List.of(loja1, loja2);
        this.semaforo = semaforo;
    }

    // Enquanto o cliente tiver saldo na conta:
    public void run() {
        Random random = new Random();
        while (conta.getSaldo() > 0) {
            synchronized (semaforo) {
                Loja loja = lojas.get(random.nextInt(lojas.size()));
                // Define o valor da compra entre (100 ou 200 reais)
                double valor = random.nextBoolean() ? 100.0 : 200.0;
                if (conta.getSaldo() >= valor) {
                    loja.getConta().getbanco().realizarTransacao(this, nome, valor, loja);
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                }
            }
        }
    }

    public Conta getConta() {
        return conta;
    }
}
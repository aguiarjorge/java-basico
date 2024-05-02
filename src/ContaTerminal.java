import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private float saldo;
    
    public ContaTerminal(int numero, String agencia, String nomeCliente, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número da conta:");
        this.numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Insira a agência:");
        this.agencia = scanner.nextLine();
        System.out.println("Insira o nome do cliente:");
        this.nomeCliente = scanner.nextLine();
        System.out.println("Insira o saldo:");
        this.saldo = scanner.nextFloat();
        scanner.close();
    }
    
    public void exibirDados() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque.");
    }
    
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal(0, "", "", 0.0f);
        conta.inserirDados();
        conta.exibirDados();
    }
}

import java.util.Scanner; 

public class ContaBanco {
    
    public int Numero;
    public String Agencia;
    public String NomeCliente;
    public double Saldo;

    public ContaBanco(int num, String agencia, String nome, double saldo){
        this.Numero = num;
        this.Agencia = agencia;
        this.NomeCliente = nome;
        this.Saldo = saldo;
    }

    public void ExibirInfo(ContaBanco conta){
        System.out.println("Olá Sr." + conta.NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + conta.Agencia + ", Conta " + conta.Numero + " e seu saldo " + conta.Saldo + " já está disponível para saque.");
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Número: ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua Agência: ");
        String ag = sc.nextLine();

        System.out.print("Digite seu Nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu Saldo: ");
        double saldo = sc.nextDouble();

        ContaBanco conta = new ContaBanco(num,ag,nome,saldo);

        conta.ExibirInfo(conta);
        
    }
}

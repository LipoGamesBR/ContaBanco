import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente =  "MARIO ANDRADE";
        double saldo = 237.48;
        String textoFinal;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero da sua agencia: ");
        agencia = scanner.nextLine();
        
        System.out.println("Digite o numero da sua conta: ");
        numero = scanner.nextInt();
        
        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();
        nomeCliente = scanner.nextLine();

        textoFinal = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(Integer.toString(numero)).concat(" e seu saldo ").concat(Double.toString(saldo)).concat("já está disponível para saque");

        System.out.println(textoFinal);


        System.out.println(numero);
        scanner.close();
        /*
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto:");
        while(sc.hasNext()){
            i++;
            System.out.println("Token: "+sc.next());
        }
        sc.close(); //Encerra o programa
        */
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //todo: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite seu nome !");
        String nomeCli = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta !");
        int contNum = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agenciaNum = scanner.next();

        System.out.println("Por favor, digite o saldo !");
        float saldoCont = scanner.nextFloat();
        System.out.println();
        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCli + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaNum
         + ", conta " + contNum + " e seu saldo " + saldoCont + " já está disponível para saque.");
        scanner.close();
    }
}

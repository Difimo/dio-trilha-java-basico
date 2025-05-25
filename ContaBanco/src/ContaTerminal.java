import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe scanner, exibir as mensagems para o nosso usuario
        // obter pela classe scanner os valores digitados no terminal
        // exibir a mensagem final ( msg da conta criada)
        Conta diegConta = new Conta();


        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String numero_agencia =  entrada.nextLine();
        diegConta.setAgencia(numero_agencia);






        System.out.println("Ola , nome !! obrigado por criar uma conta em nosso banco" +
                            "sua agência é " + diegConta.getAgencia());
        
        

        
        scanner.close();
        
    }
}

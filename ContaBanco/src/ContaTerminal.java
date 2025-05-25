import java.util.Scanner;
        // TODO: Conhecer e importar a classe scanner, exibir as mensagems para o nosso usuario
        // obter pela classe scanner os valores digitados no terminal
        // exibir a mensagem final ( msg da conta criada)

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
      
        Conta diegConta = new Conta();


        

        System.out.println("Por favor, digite o número da Agência !");
        String numero_agencia =  entrada.nextLine();
        diegConta.setAgencia(numero_agencia);

        System.out.println("Por favor, digite o número da Conta!");
        int numero_conta =  entrada.nextInt();
        diegConta.setNumero(numero_conta);
        // inserido um nextLine() vazio para corrigir o problema de buffer /n antes do nextLine() seguinte.
        entrada.nextLine(); 


        System.out.println("Por favor, digite o nome do titular da conta!");
        String nome_conta =  entrada.nextLine();
        diegConta.setNome_cliente(nome_conta);

        System.out.println("Por favor, digite o Saldo do titular da conta!");
        float saldo_conta =  entrada.nextFloat();
        diegConta.setSaldo(saldo_conta);



        System.out.println(" Ola " +diegConta.getNome_cliente() +" !!!"+"\n Obrigado por criar uma conta em nosso banco " +
                            "\n Sua agência é " + diegConta.getAgencia() + 
                            "\n O numero da sua conta é " + diegConta.getNumero()+
                            "\n O seu saldo em conta é R$ " + diegConta.getSaldo());
        
        

        
        entrada.close();
        
    }
}

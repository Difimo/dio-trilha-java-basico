
public class Conta {

//  A T R I B U T O S 
// os atributos da minha classe como privado 
    
    private String agencia;
    /*private int numero;
    private String nome_cliente;
    private float saldo; */



// M E T O D O S     E S P E C I A I S
// Metodos getter and setter to set the value of variables!

    /*public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    } */
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    /*public String getNome_cliente() {
        return nome_cliente;
    }
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    } */

// M E T O D O   C O N S T R U T O R
// crie um metodo construtor para agilizar a inicialização

  public Conta() {
        
    this.agencia = "0000"; // numero da agencia
    /*this.numero = 0; // numero da conta
    this.nome_cliente = " "; // nome do cliente
    this.saldo = 0.0; // Saldo da conta.*/
    
  }

    
}  





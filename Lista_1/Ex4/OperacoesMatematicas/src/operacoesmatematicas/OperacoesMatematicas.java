/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacoesmatematicas;
import java.util.Scanner;
/**
 *
 * @author prod
 */
public class OperacoesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicializa o usuario
        System.out.println("Digite seu nome:");
        String name = sc.nextLine();
        
        System.out.println("Agora seu CPF:");
        String cpf = sc.next();
        
        System.out.println("Por ultimo sua idade:");
        int age = sc.nextInt();
        
        Usuario user = new Usuario(name, cpf, age);
        
        // Ouve um comando e parametros
        while (true){
            System.out.println("operações: 1= soma; 2= subtração; 3= multiplicação 4= divisão; 5= sair da aplicação; ");
            System.out.println("Digite uma operação, no formato:");
            System.out.println("<operação> <primeiro_numero> <segundo_numero>");
            
            int operacao, num1, num2;
            operacao = sc.nextInt();
            
            if(operacao == 5){break;}
            
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            
            Operacoes ops = new Operacoes();
            Resultado result = ops.realizarCalculo(user, operacao, num1, num2);
            
            printInfo(result, num1, num2, user);
        }
        
        // Encerra a aplicação
           System.out.println("Obrigado por usar esta aplicação");
       
    }
    public static void printInfo(Resultado result, float num1, float num2, Usuario user){
        char tipo;
        switch(result.getTipo()){
            case 1:
                tipo = '+';
                break;
            case 2:
                tipo = '-';
                break;
            case 3:
                tipo = '*';
                break;
            case 4:
                tipo = '/';
                break;
            default:
                tipo = 'u';
                break;
        }
        System.out.printf("%.2f %c %.2f = %.2f\n",num1, tipo, num2, result.getResultado());
        System.out.println("Feito por:");
        user.printUsuario();
        System.out.println("Na data:");
        result.printData();
    }
    
}

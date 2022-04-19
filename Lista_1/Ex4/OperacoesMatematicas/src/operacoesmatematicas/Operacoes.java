/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoesmatematicas;
/**
 *
 * @author prod
 */
public class Operacoes {
    
    public Resultado realizarCalculo(Usuario user, int operacao, float num1, float num2){
        float op_result;
        
        switch (operacao){
            case 1:
                op_result = num1+num2;
                break;
            case 2:
                op_result = num1-num2;
                break;
            case 3:
                op_result = num1*num2;
                break;
            case 4:
                op_result = num1/num2;
                break;
            default:
                op_result = 0;
                break;
        }
        
        Resultado result = new Resultado();
        
        result.setTipo(operacao);
        
        
        result.setUsuario(user);
        result.setResultado(op_result);
        
        return result;
    }
}

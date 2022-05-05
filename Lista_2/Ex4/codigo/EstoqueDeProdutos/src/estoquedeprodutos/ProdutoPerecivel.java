/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquedeprodutos;
import java.time.LocalDate;  
import java.time.Duration;
/**
 *
 * @author ryrden
 */
public class ProdutoPerecivel extends Produto{
    protected LocalDate dataValidade;
    
    public ProdutoPerecivel(int codigo, float precoUnitario, int qntEstoque, String descricao, LocalDate dataValidade){
        super(codigo, precoUnitario, qntEstoque, descricao);
        this.dataValidade = dataValidade;
        
    }
    
    public int retirarEstoque(int qnt, LocalDate diaCorrente){
        
        long diferenca = Duration.between(diaCorrente.atStartOfDay(), this.dataValidade.atStartOfDay())
                .toDays();
        if (diferenca < 30){
            this.qntEstoque = 0;
            return 0;
        }
        
        if (qnt > this.qntEstoque)
            qnt = this.qntEstoque;
        this.qntEstoque -= qnt;
        
        return qnt;    
    }
    
    public boolean acrescentarEstoque(int qnt, LocalDate diaCorrente){
        if (this.qntEstoque != 0)
            return false;
        
        this.qntEstoque += qnt;
        
        return true;
    }

    public LocalDate getDate() {
        return dataValidade;
    }

    public void setDate(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    
}

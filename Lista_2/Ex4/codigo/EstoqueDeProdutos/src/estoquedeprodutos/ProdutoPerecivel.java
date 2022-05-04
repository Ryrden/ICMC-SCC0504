/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquedeprodutos;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author ryrden
 */
public class ProdutoPerecivel extends Produto{
    protected Date dataValidade;
    
    public ProdutoPerecivel(int codigo, float precoUnitario, int qntEstoque, String descricao, Date dataValidade){
        super(codigo, precoUnitario, qntEstoque, descricao);
        this.dataValidade = dataValidade;
        
    }
    
    public int retirarEstoque(int qnt, Date diaCorrente){
        long difMiliSeg = diaCorrente.getTime() - this.dataValidade.getTime();

        long diferenca = TimeUnit.DAYS.convert(difMiliSeg, TimeUnit.MILLISECONDS);
        if (diferenca < 30){
            this.qntEstoque = 0;
            return 0;
        }
        
        if (qnt > this.qntEstoque)
            qnt = this.qntEstoque;
        this.qntEstoque -= qnt;
        
        return qnt;    
    }
    
    public boolean acrescentarEstoque(int qnt, Date diaCorrente){
        if (this.qntEstoque != 0)
            return false;
        
        this.qntEstoque += qnt;
        
        return true;
    }

    public Date getDate() {
        return dataValidade;
    }

    public void setDate(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    
}

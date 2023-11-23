
package br.edu.cefsa.compiler.abstractsyntaxtree;

import br.edu.cefsa.compiler.datastructures.EasyVariable;

public class TermoPec extends AbstractCommand  {
    
    private EasyVariable custoFixo, custoVariavel, precoVenda;

    public TermoPec(EasyVariable custoFixo, EasyVariable custoVariavel, EasyVariable precoVenda) {
        this.custoFixo = custoFixo;
        this.custoVariavel = custoVariavel;
        this.precoVenda = precoVenda;
    }

    @Override
    public String generateJavaCode() {
        return custoFixo.getName() + "/(" + precoVenda.getName() + "-" + custoVariavel.getName() + ")";
    }

    @Override
    public String toString() {
        return "TermoPec [custoFixo=" + custoFixo.getName() + " precoVenda=" + precoVenda.getName() + " custoVariavel=" + custoVariavel.getName() + "]";
    }
}

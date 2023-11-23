
package br.edu.cefsa.compiler.abstractsyntaxtree;

import br.edu.cefsa.compiler.datastructures.EasyVariable;


public class CommandPec extends AbstractCommand {

    private EasyVariable custoFixo, custoVariavel, precoVenda;

    public CommandPec(EasyVariable custoFixo, EasyVariable custoVariavel, EasyVariable precoVenda) {
        this.custoFixo = custoFixo;
        this.custoVariavel = custoVariavel;
        this.precoVenda = precoVenda;
    }

    @Override
    public String generateJavaCode() {
        return "System.out.println(" + custoFixo.getName() + "/(" + precoVenda.getName() + "-" + custoVariavel.getName() + "));";
    }

    @Override
    public String toString() {
        return "CommandPec [custoFixo=" + custoFixo.getName() + " precoVenda=" + precoVenda.getName() + " custoVariavel=" + custoVariavel.getName() + "]";
    }
}

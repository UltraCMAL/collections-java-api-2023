package main.java.list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    //construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

        //metodo getter
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

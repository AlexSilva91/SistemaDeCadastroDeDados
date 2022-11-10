package dados;
/**
 *
 * @author Alex da Silva Alves
 */
public class Manutencao extends FuncionariosAbstratos{
    private int cod;
    private String funcao;
    
    public Manutencao(String nome, int idade, int numeroDedependentes, int cod, String funcao) {
        super(nome, idade, numeroDedependentes);
        this.cod = cod;
        this.funcao = funcao;
    }

    public Manutencao() {
        super();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}

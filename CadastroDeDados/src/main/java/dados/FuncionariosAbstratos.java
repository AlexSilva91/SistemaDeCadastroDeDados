package dados;
/**
 *
 * @author HP - 4300
 */
public abstract class FuncionariosAbstratos {
    private String nome;
    private int idade;
    private int numeroDedependentes;
    private String funcao;

    public FuncionariosAbstratos(String nome, int idade, int numeroDedependentes) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDedependentes = numeroDedependentes;
       
    }

    public FuncionariosAbstratos() {
        this.nome="";
        this.idade=0;
        this.numeroDedependentes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDedependentes() {
        return numeroDedependentes;
    }

    public void setNumeroDedependentes(int numeroDedependentes) {
        this.numeroDedependentes = numeroDedependentes;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
}

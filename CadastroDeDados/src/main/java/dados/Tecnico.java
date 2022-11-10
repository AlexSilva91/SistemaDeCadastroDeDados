package dados;
/**
 *
 * @author Alex da Silva Alves
 */
public class Tecnico extends FuncionariosAbstratos{
    private String matricula;
    private String funcao;
    
    public Tecnico(String nome, int idade, int numeroDedependentes,  String matricula, String funcao) {
        super(nome, idade, numeroDedependentes);
        this.matricula = matricula;
        this.funcao = funcao;
    }

    public Tecnico() {
        super();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

  
}

package dados;
/**
 *
 * @author Alex da Silva Alves
 */
public class Professor extends FuncionariosAbstratos{
    private String matricula;
    private String areaDeatuacao;
    public Professor(String nome, int idade, int numeroDedependentes,String matricula, String areaDeatuacao) {
        super(nome, idade, numeroDedependentes);
        this.matricula = matricula;
        this.areaDeatuacao = areaDeatuacao;
        
    }

    public Professor() {
        super();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAreaDeatuacao() {
        return areaDeatuacao;
    }

    public void setAreaDeatuacao(String areaDeatuacao) {
        this.areaDeatuacao = areaDeatuacao;
    }
    
    
}

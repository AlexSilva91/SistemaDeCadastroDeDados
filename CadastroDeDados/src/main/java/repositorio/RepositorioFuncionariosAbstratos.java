package repositorio;

import dados.FuncionariosAbstratos;
import excecoes.FuncionarioNaoEncontradoException;
import excecoes.VetorCheioException;
import excecoes.VetorVazioException;
import java.util.ArrayList;

/**
 *
 * @author Alex da Silva Alves
 */
public class RepositorioFuncionariosAbstratos implements InterfaceRepositorio{
    private final ArrayList<FuncionariosAbstratos> funcionario;
    
    public RepositorioFuncionariosAbstratos() {
        this.funcionario = new ArrayList();
    }
    
    @Override
    public void inserir(FuncionariosAbstratos funcionario) throws VetorCheioException {
        this.funcionario.add(funcionario);
    }

    @Override
    public FuncionariosAbstratos consultar(String nome) throws VetorVazioException, FuncionarioNaoEncontradoException {
        FuncionariosAbstratos func = null;
        if (this.funcionario.size()>0) {
            boolean achou = false;
            int indiceachou = -1;
            for (int i = 0; i <= this.funcionario.size(); i++) {
                if(nome.equals(this.funcionario.get(i).getNome())){
                    achou = true;
                    indiceachou = i;
                    break;
                }
            }
            if(achou==true){
                func = funcionario.get(indiceachou);
            }else{
                throw new FuncionarioNaoEncontradoException();
            }
        }else{
        throw new VetorVazioException();
    }
        return func;
    }

    @Override
    public void remover(String nome) throws VetorVazioException, FuncionarioNaoEncontradoException {
        if(this.funcionario.size()>0){
            boolean achou = false;
            int indiceachou = 0;
            for (int i = 0; i <=this.funcionario.size(); i++) {
                if (nome.equals(this.funcionario.get(i).getNome())) {
                    achou = true;
                    indiceachou = i;
                    break;
                }
            }
            if(achou==true){
                this.funcionario.remove(this.funcionario.get(indiceachou));
            }else{
                throw new FuncionarioNaoEncontradoException();
            }
        }else{
            throw new VetorVazioException();
        }
    }

    @Override
    public void atualizar(FuncionariosAbstratos funcionario) throws VetorVazioException, FuncionarioNaoEncontradoException {
       FuncionariosAbstratos func = this.consultar(funcionario.getNome());
       funcionario = func;
    }

    @Override
    public ArrayList<FuncionariosAbstratos> listar() throws VetorVazioException {
        if(this.funcionario.size()>0){
            return this.funcionario;
        }else{
            throw new VetorVazioException();
        }
    }
    
}

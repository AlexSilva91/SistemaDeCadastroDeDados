package negocio;

import dados.FuncionariosAbstratos;
import excecoes.FuncionarioNaoEncontradoException;
import excecoes.VetorCheioException;
import excecoes.VetorVazioException;
import java.util.ArrayList;
import repositorio.RepositorioFuncionariosAbstratos;
/**
 *
 * @author Alex da Silva Alves
 */
public class CadastroFuncionarios implements InterfaceCadastroFuncionarios{
    RepositorioFuncionariosAbstratos repositorio;

    public CadastroFuncionarios(int MAX) {
        this.repositorio = new RepositorioFuncionariosAbstratos();
    }
    
    
    @Override
    public void inserir(FuncionariosAbstratos funcionario) throws VetorCheioException {
        this.repositorio.inserir(funcionario);
    }

    @Override
    public FuncionariosAbstratos consultar(String nome) throws VetorVazioException, FuncionarioNaoEncontradoException {
        return this.repositorio.consultar(nome);
    }

    @Override
    public void remover(String nome) throws VetorVazioException, FuncionarioNaoEncontradoException {
        this.repositorio.remover(nome);
    }

    @Override
    public void atualizar(FuncionariosAbstratos funcionario) throws VetorVazioException, FuncionarioNaoEncontradoException {
        this.repositorio.atualizar(funcionario);
    }

    @Override
    public ArrayList<FuncionariosAbstratos> listar() throws VetorVazioException {
        return this.repositorio.listar();
        }
    
}

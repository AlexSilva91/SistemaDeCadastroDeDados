package repositorio;

import excecoes.VetorCheioException;
import dados.FuncionariosAbstratos;
import excecoes.FuncionarioNaoEncontradoException;
import excecoes.VetorVazioException;
import java.util.ArrayList;
/**
 *
 * @author Alex da Silva Alves
 */
public interface InterfaceRepositorio {
    public void inserir(FuncionariosAbstratos funcionario) throws VetorCheioException;
    public FuncionariosAbstratos consultar(String nome) throws VetorVazioException, FuncionarioNaoEncontradoException;
    public void remover(String nome) throws VetorVazioException, FuncionarioNaoEncontradoException;
    public void atualizar(FuncionariosAbstratos funcionario) throws VetorVazioException, FuncionarioNaoEncontradoException;
    public ArrayList<FuncionariosAbstratos> listar() throws VetorVazioException;
}

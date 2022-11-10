package fachada;

import dados.FuncionariosAbstratos;
import excecoes.FuncionarioNaoEncontradoException;
import excecoes.VetorCheioException;
import excecoes.VetorVazioException;
import java.util.ArrayList;
import negocio.CadastroFuncionarios;
/**
 *
 * @author Alex da Silva Alves
 */
public class FachadaFuncionarios implements InterfaceFachadaFuncionarios{
    private final CadastroFuncionarios cadastroFuncionario;

    public FachadaFuncionarios(int MAX) {
        this.cadastroFuncionario = new CadastroFuncionarios(MAX);
    }
    
    @Override
    public void inserir(FuncionariosAbstratos funcionario) throws VetorCheioException {
       this.cadastroFuncionario.inserir(funcionario);
    }

    @Override
    public FuncionariosAbstratos consultar(String nome) throws VetorVazioException, FuncionarioNaoEncontradoException {
       return this.cadastroFuncionario.consultar(nome);
    }

    @Override
    public void remover(String nome) throws VetorVazioException, FuncionarioNaoEncontradoException {
       this.cadastroFuncionario.remover(nome);
    }

    @Override
    public void atualizar(FuncionariosAbstratos funcionario) throws VetorVazioException, FuncionarioNaoEncontradoException {
        this.cadastroFuncionario.atualizar(funcionario);
    }

    @Override
    public ArrayList<FuncionariosAbstratos> listar() throws VetorVazioException {
        return this.cadastroFuncionario.listar();
    }
    
}

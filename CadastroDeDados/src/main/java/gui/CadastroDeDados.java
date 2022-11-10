package gui;

import dados.Administracao;
import dados.FuncionariosAbstratos;
import dados.Manutencao;
import dados.Professor;
import dados.Tecnico;
import excecoes.FuncionarioNaoEncontradoException;
import excecoes.VetorCheioException;
import excecoes.VetorVazioException;
import fachada.FachadaFuncionarios;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex da Silva Alves
 */
public class CadastroDeDados {
    public static int MAX = 100;
    public static void main(String[] args) {
       Scanner tc = new Scanner(System.in);
       FachadaFuncionarios funcionario = new FachadaFuncionarios(MAX);
       FuncionariosAbstratos funcionarioAbstrato;
       Administracao adm;
       Manutencao manutencao;
       Professor professor;
       Tecnico tecnico;
       int op0, op1, op2, idade, cod, numeroDedepedentes;
       String nome, funcao, matricula, areaDeatuacao;
       do{
           System.out.println("-----------------------------------------------------------------");
           System.out.println("----------------Cadastro de Dados de Funcionarios----------------");
           System.out.println("-----------------------------------------------------------------");
           System.out.println("0 -- Sair");
           System.out.println("1 -- Cadastrar");
           System.out.println("2 -- Consultar");
           System.out.println("3 -- Remover");
           System.out.println("4 -- Listar");
           System.out.println("5 -- Alterar");
           System.out.println("------------------------------------------------------------------");
           System.out.print("Digite sua opção: ");
           op0=tc.nextInt();
           
           switch(op0){
               case 0:
                   System.out.println("Até Logo!");
                   break;
               case 1:
                   try{
                       do{
                           System.out.println();
                           System.out.println("0 - Voltar");
                           System.out.println("1 - Cadastrar Funcionario Adm");
                           System.out.println("2 - Cadastrar Professor");
                           System.out.println("3 - Cadastrar Técnico");
                           System.out.println("4 - Cadastrar Funcionario da Manutenção");
                           System.out.print("Digite sua opção: ");
                           op1 = tc.nextInt();
                           switch(op1){
                               case 0:
                                   break;
                               case 1:
                                   System.out.println();
                                   System.out.print("Nome: ");
                                   nome = tc.next();
                                   System.out.print("Idade: ");
                                   idade = tc.nextInt();
                                   System.out.print("Função: ");
                                   funcao= tc.next();
                                   System.out.print("Numero de dependentes: ");
                                   numeroDedepedentes = tc.nextInt();
                                   System.out.print("Código: ");
                                   cod = tc.nextInt();
                                   adm = new Administracao(nome, idade, numeroDedepedentes, cod, funcao);
                                   funcionario.inserir(adm);
                                   System.out.println();
                                   System.out.println("Operação realizada com sucesso!");
                                   break;
                               case 2:
                                   System.out.println();
                                   System.out.print("Nome: ");
                                   nome = tc.next();
                                   System.out.print("Idade: ");
                                   idade = tc.nextInt();
                                   System.out.print("Numero de dependentes: ");
                                   numeroDedepedentes = tc.nextInt();
                                   System.out.print("Matricula: ");
                                   matricula = tc.next();
                                   System.out.print("Disciplina: ");
                                   areaDeatuacao = tc.next();
                                   professor = new Professor(nome, idade, numeroDedepedentes, matricula, areaDeatuacao);
                                   funcionario.inserir(professor);
                                   System.out.println();
                                   System.out.println("Operação realizada com sucesso!");
                                   break;
                               case 3:
                                   System.out.println();
                                   System.out.print("Nome: ");
                                   nome = tc.next();
                                   System.out.print("Idade: ");
                                   idade = tc.nextInt();
                                   System.out.print("Função: ");
                                   funcao = tc.next();
                                   System.out.print("Numero de dependentes: ");
                                   numeroDedepedentes = tc.nextInt();
                                   System.out.print("Matricula: ");
                                   matricula = tc.next();
                                   tecnico = new Tecnico(nome, idade, numeroDedepedentes, matricula, funcao);
                                   funcionario.inserir(tecnico);
                                   System.out.println();
                                   System.out.println("Operação realizada com sucesso!");
                                   break;
                               case 4:
                                   System.out.println();
                                   System.out.print("Nome: ");
                                   nome = tc.next();
                                   System.out.print("Idade: ");
                                   idade = tc.nextInt();
                                   System.out.print("Função: ");
                                   funcao = tc.next();
                                   System.out.print("Numero de dependentes: ");
                                   numeroDedepedentes = tc.nextInt();
                                   System.out.print("Código: ");
                                   cod = tc.nextInt();
                                   manutencao = new Manutencao(nome, idade, numeroDedepedentes, cod, funcao);
                                   funcionario.inserir(manutencao);
                                   System.out.println();
                                   System.out.println("Operação realizada com sucesso!");
                                   break;
                               default:
                                   System.out.println("");
                                   System.out.println("Opção Inválida!");
                                   break;       
                           }
                       }while(op1!=0);
                  }catch(VetorCheioException msg){
                       System.out.println(msg.getMessage());
                       System.out.println("");
                   }
                   break;
               case 2:
                   try{
                       System.out.println();
                       System.out.println("Nome: ");
                       nome = tc.next();
                       funcionarioAbstrato = funcionario.consultar(nome);
                       System.out.println("");
                       if (funcionarioAbstrato instanceof Administracao) {
                           System.out.println("Administração");
                       }else if(funcionarioAbstrato instanceof Professor){
                           System.out.println("Professor");
                       }else if(funcionarioAbstrato instanceof Tecnico){
                           System.out.println("Tecnico");
                       }else{
                           System.out.println("Manutenção");
                       }
                       System.out.println("Nome: "+funcionarioAbstrato.getNome());
                       System.out.println("Idade: "+funcionarioAbstrato.getIdade());
                       System.out.println("Função: "+funcionarioAbstrato.getFuncao());
                       System.out.println("Numero de dependentes: "+funcionarioAbstrato.getNumeroDedependentes());
                   }catch(VetorVazioException | FuncionarioNaoEncontradoException msg){
                       System.out.println("");
                       System.out.println(msg.getMessage());
                       System.out.println("");
                   }
                   break;
               case  3:
                    try{
                        System.out.println();
                        System.out.print("Nome: ");
                        nome = tc.next();
                        System.out.println();
                        funcionario.remover(nome);
                        System.out.println();
                        System.out.println("Operação realizada com sucesso!");
                    }catch(VetorVazioException | FuncionarioNaoEncontradoException msg){
                        System.out.println(msg.getMessage());
                        System.out.println();
                    }
                   break;
               case 4:
                   try{
                       System.out.println();
                       ArrayList<FuncionariosAbstratos>func = funcionario.listar();
                       for (FuncionariosAbstratos fc : func) {
                           System.out.println();
                           if (fc instanceof Administracao) {
                               System.out.println("Administração: ");
                           }else if(fc instanceof Professor){
                               System.out.println("Professor: ");
                           }else if(fc instanceof Tecnico){
                               System.out.println("Técnico: ");
                           }else{
                               System.out.println("Manutenção: ");
                           }
                           System.out.println("Nome: "+ fc.getNome());
                           System.out.println("Idade: "+ fc.getIdade());
                           System.out.println("Função: "+fc.getFuncao());
                           System.out.println("Dependentes: "+fc.getNumeroDedependentes());
                       }
                   }catch(VetorVazioException msg){
                       System.out.println(msg.getMessage());
                       System.out.println();
                   }
                   break;
               case 5:
                   try{
                       System.out.println("Nome: ");
                       nome = tc.next();
                       funcionarioAbstrato = funcionario.consultar(nome);
                       do{
                           System.out.println("");
                           System.out.println("0 - Voltar");
                           System.out.println("1 - Alterar idade");
                           System.out.println("2 - Alterar número de dependentes");
                           System.out.print("Digite sua opção: ");
                           op2 = tc.nextInt();
                           switch(op2){
                               case 0:
                                   break;
                               case 1:
                                   System.out.println("");
                                   System.out.print("Nova idade: ");
                                   idade = tc.nextInt();
                                   funcionarioAbstrato.setIdade(idade);
                                   System.out.println("");
                                   System.out.println("Operação realizada com sucesso!");
                                   break;
                               case 2:
                                   System.out.println("");
                                   System.out.print("Novo Número de dependentes: ");
                                   numeroDedepedentes = tc.nextInt();
                                   funcionarioAbstrato.setNumeroDedependentes(numeroDedepedentes);
                                   System.out.println("Operação realizada com sucesso!");
                                   break;
                               default:
                                   System.out.println("");
                                   System.out.println("Opção inválida!");
                                   break;
                           }
                       }while(op2!=0);
                   }catch(VetorVazioException | FuncionarioNaoEncontradoException msg){
                       System.out.println(msg.getMessage());
                       System.out.println("");
                   }
                   break;
               default:
                   System.out.println("");
                   System.out.println("Opção inválida!");
                   break;
           }
       }while(op0!=0);
       
    }
}

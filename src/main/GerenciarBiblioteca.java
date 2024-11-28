package Projec;

import Projec.Model.*;
import Projec.View.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GerenciarBiblioteca {

    public static void main(String[] args) {

        String opc;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Items> items = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        ControleCompra compra = new ControleCompra();

        do{

            for (int i = 0; i < args.length; i++) {
                if (usuarios.get(i).equals(clientes.getClass())) {
                    
                }
            }


            System.out.println("\t ITEMS:");
            for (Items i : items) {
                System.out.print("\n =>Item: "+i.getNome() + "\t ID: "+i.getIDItem()+"\n -Disponivel: "+i.getDispo()+"\n");
            }

            
            System.out.println("\n \t CLIENTES:");
            for (Cliente u : clientes) {
                System.out.print("\n =>Usuario: "+u.getNome()+" ID: "+u.getIdUser());
                for (int i = 0; i < clientes.size(); i++) {
                    System.out.print("\n -Comprados: "+u.getItem(i).getNome());
                }
            }
            
            System.out.println("\n \t \t ==>OPCOES<==");
            System.out.println("\n C.cadastrar-se \t L.cadastrar Item \t E.Comprar \t S.sair \n");
            opc = scan.nextLine();

            switch (opc) {
                case "c":
                    System.out.println("\t => CADASTRO DE USUARIO");
                    
                    CadastroUser cadUse = new CadastroUser(usuarios);
                    cadUse.setVisible(true);

                    break;

                case "l":
                    System.out.println("\t =>CADASTRO DE ITEM");
                    
                    CadastroItem cadIt = new CadastroItem(items);
                    cadIt.setVisible(true);
                    
                    break;

                case "e":
                    System.out.println("\t =>COMPRA DE ITEMS");
                     
                    Solicitar sol = new Solicitar(items);
                    sol.setVisible(true);

                    /* 
                    String user;
                    System.out.println("Digite seu usuario");
                    user = scan.nextLine();

                    String eopc;
                    System.out.println("Deseja \n E.emprestar livro \t D.devolver livro");
                    eopc = scan.nextLine();
                    switch (eopc) {
                        case "e":
                            for (Usuario us : usuarios) {
                                if (us.getNome().equals(user)) {
                                    String usLivro;
                                    System.out.println("Digite o nome do livro que procura");
                                    usLivro = scan.nextLine();
                                    for (Livro ls : livros) {
                                        if (ls.getTitulo().equals(usLivro)) {
                                            emprestimo.registrarEmprestimo(us, ls);
                                            us.setEmprestados(ls);
                                        } 
                                    }
                                    break;
                                }else{
                                    System.out.println("Usuario não achado");
                                }
                            }
                            break;
                        case "d": 
                            for (Usuario us : usuarios) {
                                if (us.getNome().equals(user)) {
                                    String usLivro;
                                    System.out.println("Digite o nome do livro que deseja devolver");
                                    usLivro = scan.nextLine();
                                    for (Livro ls : livros) {
                                        if (us.getEmprestados().contains(ls)) {
                                            emprestimo.registrarDevolucao(us, ls);
                                            us.getEmprestados().remove(ls);
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                    */
                default:
                    break;
            }

        } while(!opc.equals("s"));
        
        scan.close();
    }
}

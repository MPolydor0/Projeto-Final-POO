package Projec.Model;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    private ArrayList<Items> carrinho = new ArrayList<Items>();

    //get set de lista de carrinho
    public void setCarrinho(Items livro){
        this.carrinho.add(livro);
    }
    public ArrayList<Items> getCarrinho(){
        return carrinho;
    }
    public Items getItem(Integer i){
        return carrinho.get(i);
    }

    //construtor
    public Cliente(Integer id, String nom, String emai, String pass){
        super(id, nom, emai, pass);
    }
}

package com.uagrm.developsoft6.easyfood.model;

import java.util.ArrayList;
import java.util.List;

public class ObjetoBebida {

    private String img;
    private String nome;
    private double preco;

    public static List<ObjetoBebida> JsonChamada(){


        List<ObjetoBebida> bebidas = new ArrayList<>();

        bebidas.add(new ObjetoBebida("garrafa","Coca cola",5.00));
        bebidas.add(new ObjetoBebida("suco","Jugo",9.00));
        bebidas.add(new ObjetoBebida("garrafa2l","Refrigerante",10.00));
        bebidas.add(new ObjetoBebida("lata","Gaseosa",13.00));

        return bebidas;

    }

    public ObjetoBebida(String imagem, String nome, double prexo) {
        this.img = imagem;
        this.nome = nome;
        this.preco = prexo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double prexo) {
        this.preco = prexo;
    }
}

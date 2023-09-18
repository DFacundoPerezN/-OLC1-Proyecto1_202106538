/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Faxx
 */

public class GraficoBarras {
    public GraficoBarras graficoBarrasGlobal;
    
    public List<String> ejeX = new ArrayList<>();
    public List<Double> valores = new ArrayList<>();
    public String tituloX;
    public String tituloY;


    public GraficoBarras(String titulo, String tituloX, String tituloY, List<String> ejeX, List<Double> valores){
    this.titulo = titulo;
    this.ejeX = ejeX;
    this.tituloX = tituloX;
    this.tituloY = tituloY;
    this.valores = valores;
    }
    
    public String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getEjeX() {
        return ejeX;
    }

    public void setEjeX(List<String> ejeX) {
        this.ejeX = ejeX;
    }

    public List<Double> getValores() {
        return valores;
    }

    public void setValores(List<Double> valores) {
        this.valores = valores;
    }

    public String getTituloX() {
        return tituloX;
    }

    public void setTituloX(String tituloX) {
        this.tituloX = tituloX;
    }

    public String getTituloY() {
        return tituloY;
    }

    public void setTituloY(String tituloY) {
        this.tituloY = tituloY;
    }
    
   
    //public GraficoBarras graficoBarrasGlobal= new GraficoBarras("title",salidas,"Xtitle","Ytitle", numeros;);
}

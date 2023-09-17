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
public class GraficoPie {
            public String titulo;
            public String tituloEjeX;
            public String tituloEjeY;
            public List<String> ejeX = new ArrayList<>();
            public List<Double> valores = new ArrayList<>();


            public GraficoPie(String titulo, String tituloX, String tituloY, List<String> ejeX, List<Double> valores){
            this.titulo = titulo;
            this.tituloEjeX = tituloX;
            this.tituloEjeY = tituloY;
            this.ejeX = ejeX;
            this.valores = valores;
        }
            
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloEjeX() {
        return tituloEjeX;
    }

    public void setTituloEjeX(String tituloEjeX) {
        this.tituloEjeX = tituloEjeX;
    }

    public String getTituloEjeY() {
        return tituloEjeY;
    }

    public void setTituloEjeY(String tituloEjeY) {
        this.tituloEjeY = tituloEjeY;
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
            
}

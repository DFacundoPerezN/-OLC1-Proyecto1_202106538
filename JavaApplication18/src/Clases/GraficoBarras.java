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
            public String titulo;
            public List<String> ejeX = new ArrayList<>();
            public List<String> ejeY = new ArrayList<>();
            public List<Double> valores = new ArrayList<>();


            public GraficoBarras(String titulo, List<String> ejeX, List<String> ejeY, List<Double> valores){
            this.titulo = titulo;
            this.ejeX = ejeX;
            this.ejeY = ejeY;
            this.valores = valores;
        }
}

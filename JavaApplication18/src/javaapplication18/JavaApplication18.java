/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import Analizadores.Parser;
import Analizadores.Scanner;
import Clases.GraficoBarras;
import Clases.GraficoPie;
import java.util.ArrayList;
import java.util.List;

        
/**
 *
 * @author Faxx
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new InterfazInicial().setVisible(true);
        String p = "\n" +
        "\n" +
        "{\n" +
        "	\"Titulo\":\"titulo Pie\",\n\n" +
        "	\"variable1\": 4.5,\n" +
        "	\"Titulo2\": \"titulo barras\",\n" +
        "	\"variable2\": 5.0\n" +
        "\n" +
        "}";
        
        String m = "// Ya salio compi1 :)\n" +
        "\n" +
        "void main ( ){\n" +
        "	int b = 2;\n" +
        "	int a =1;\n" +
        "	int var1 = 5+8*9;\n" +
        "	if (b > a){\n" +
        "		Console.Write(\"b mayor que a\");\n" +
        "	}else if(a == b){\n" +
        "		Console.Write(\"a y b son iguales\");\n" +
        "	}\n" +
        "	void DefinirGlobales(){\n" +
        "		string reporte1 = \"Reporte 1\";\n" +
        "		double pe1 = 0.8;\n" +
        "		double pe2 = 0.5;\n" +
        "		double pe3 = 0.2;\n" +
        "		double po1 = ${ NewValor, \"archivo2.json\", \"valor1\"};\n" +
        "		double po2 = ${ NewValor, \"archivo1.json\", \"valor1\"};\n" +
        "		string vart = \"Valor Obtenido\";\n" +
        "		string var2 = \"Valor Esperado clase 1\";\n" +
        "		string var22 = \"Valor Obtenido clase 1\";\n" +
        "		string var3 = \"Valore Esperado clase 2\";\n" +
        "		string var3 = \"Valor Obtenido clase 2\";\n" +
        "	}\n" +
        "	void GraficaBarras(){\n" +
        "		string Titulo= reporte1;\n" +
        "		string [] Ejex= { \"Probabilidad Esperada clase 1\", \"Probabilidad Obtenida Clase 1\", var2, var22, var3, var33};\n" +
        "		double [] Valores= { pe1, po1, pe2, po2, pe3, ${ NewValor, \"archivo1.json\", \"valor2\"} };\n" +
        "		string TituloX= \"Atributo\";\n" +
        "		string TituloY= \"Puntaje\";\n" +
        "	}\n" +
        "	while(a < 10){\n" +
        "		Console.Write(\"el valor de a es: \" + a);\n" +
        "	}\n" +
        "\n" +
        "}";
        
       String texto ="void main() { int b = 2;"+
"	double a = 4.55;\n" +
"	int var1 = 5+8*9;\n" +
"        bool var2 = true;\n" +
"        Console.write(a);\n" +
"}\n" +
"\n" +
"// Ya salio compi1 :)\n" +
"\n" +
"void main( ){\n" +
"        Console.write(a);\n" +
"        Console.write(5.58);\n" +
"Console.write(99);\n" +
"Console.write(True);\n" +
"Console.write(a+5);\n" +
"Console.write(b+b);\n" +
"}";
       String JSON ="/* ejemplo de carga \n" +
"\n" +
"   de objeto json */\n" +
"\n" +
"\n" +
"{\n" +
"	\"Titulo\":\"titulo Pie\",\n" +
"	\"variable1\": 4.5,\n" +
"	\"Titulo2\": \"titulo barras\",\n" +
"	\"variable2\": 5.0\n" +
"\n" +
"}";
       String test ="	\n" +
"		Console.Write(\"el valor de a es: \" + a);\n" +
"        a = a+1;\n" +
"	\n" ;
       
    System.out.println("");
    //String contenido = AnalizadorLexico.ReporteLexemas(test);
    //GuardarArchivo.writeToFile("Reportes/Lexemas.html", contenido);
    
    String py ="+\n" +
"\"    for (int b=0; b<10; b++){\\n\" +\n" +
"\"        Console.Write(\\\"el valor de b es: \\\" + b);\\n\" +\n" +
"\"    }\\n\" +\n" +
"\"    int c = 1;\\n\" +\n" +
"\"    do {\\n\" +\n" +
"\"        Console.Write(\\\"el valor de c es: \\\" + c);\\n\" +\n" +
"\"        c=c+1;\\n\" +\n" +
"\"    } while(c < 5);\\n\" +\n" +
"\"    \\n\" +\n" +
"\"\\n\" +\n" +
"\"}\"";
    }
    static List<String> ejeX = new ArrayList<>();
    static List<Double> values = new ArrayList<>();
    public static GraficoPie graficoPieGlobal = new GraficoPie("T","X","Y",ejeX,values);
    public static GraficoBarras graficoBarrasGlobal= new GraficoBarras("T","X","Y",ejeX,values);
    

}

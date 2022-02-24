/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automoviles;

/**
 *
 * @author danielmtz
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
    Persona per1 = new Persona ();
                per1.setNombre("Daniel");
        System.out.println("nombre: " + per1.getNombre() );
        per1.comer("tacos");
        
    Persona per2 = new Persona ();
            per2.setNombre("Grisselle");
        System.out.println("nombre2: " + per2.getNombre() );
        per2.comer("quesadilla");
        
        
        Automoviles vocho=new Automoviles();
        System.out.println("El auto es un: vocho");
        vocho.setMarca("VW"); //Asignacion del estado "vocho" al atributo Marca
        System.out.println("Marca: " + vocho.getMarca() );
        vocho.setSubMarca("Sedan"); //Asignacion del estado "Sedan" al atributo SubMarca
        System.out.println("SubMarca: " + vocho.getSubMarca() );
        vocho.setModelo(1970); //Asignacion del estado "1970" al atributo Modelo
        System.out.println("Modelo: " + vocho.getModelo() );
        vocho.setColor(Color.blue); //Asignacion del estado "Blue" al atributo Color
        System.out.println("Color: " + vocho.getColor() );
        
        
        Automoviles akura=new Automoviles();
        System.out.println("El auto es un: akura");
        akura.setMarca("akura"); //Asignacion del estado "akura" al atributo Marca
        System.out.println("Marca: " + akura.getMarca() );
        akura.setSubMarca("NSX"); //Asignacion del estado "NSX" al atributo SubMarca
        System.out.println("SubMarca " + akura.getSubMarca() );
        akura.setModelo(2013); //Asignacion del estado "2013" al atributo Modelo
        System.out.println("Modelo: " + akura.getModelo() );
        akura.setColor(Color.GRAY); //Asignacion del estado "Gray" al atributo Color
        System.out.println("Color: " + akura.getColor() );
        
        
        Automoviles mustang=new Automoviles();
        System.out.println("El auto es un: mustang");
        mustang.setMarca("Ford"); //Asignacion del estado "Ford" al atributo Marca
        System.out.println("Marca: " + mustang.getMarca() );
        mustang.setSubMarca("mustang"); //Asignacion del estado "NSX" al atributo SubMarca
        System.out.println("SubMarca: " + mustang.getSubMarca() );
        mustang.setModelo(2010); //Asignacion del estado "2010" al atributo Modelo
        System.out.println("Modelo: " + mustang.getModelo() );
        mustang.setColor(Color.yellow); //Asignacion del estado "yellow" al atributo Color
        System.out.println("Color: " + mustang.getColor() );
        
        
        
    }
    
}

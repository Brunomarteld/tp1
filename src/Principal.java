
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Principal {
    public static void main(String[] args) {
        int edad=26;
        float edad_exacta=26.3f;
        String name="bruno";
        System.out.println("the name is "+ name +" and the age is "+ edad );
        ArrayList<Integer> precios  = new ArrayList<>();
        int precio1=100;
        int precio2=200;
        int precio3=300;
        precios.add(precio1);
        precios.add(precio2);
        precios.add(precio3);
        float suma_precios=0;
        for(int i=0; i<precios.size();i++)
        {int precio=precios.get(i);
         System.out.println(precio);
         suma_precios=suma_precios+precio;
         }
        float promedio=suma_precios/precios.size();
        System.out.println(promedio);
        
        ArrayList<Integer> precios_por_consola = new ArrayList<>();
        
        int cantidad;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("ingrese la cantidad de precios a ingresar");
        //faltaria control con do while aca 
         
             cantidad = scanner.nextInt();
        }
        while(cantidad<=0);
        
        for (int i=0;i<cantidad;i++)
        {int precio_por_consola = scanner.nextInt();
         precios_por_consola.add(precio_por_consola);}


        
        
        
        
        
        
        
        
        
        
        
        
               
    }
    
}
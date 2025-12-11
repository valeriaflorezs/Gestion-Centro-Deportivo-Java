/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mariafernandaviloriazapata
 */
public class ManejoArchivo {
    public static void crearArchivo(String nombreArchivo){
       File archivo = new File(nombreArchivo);
       
       
       try {
           PrintWriter salida = new PrintWriter(archivo);
           salida.close(); 
           System.out.println("Se creó el archivo");
       } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
       }
   }
   
   
   public static void escribirArchivo(String nombreArchivo, String[] v){
       File archivo = new File(nombreArchivo); 
       try {
           PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
           for (int i = 0; i<v.length; i++){
               salida.print(v[i] +  ",");
           }
           salida.print("\n");
           salida.close(); 

       } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
       } catch (IOException ex) {
          ex.printStackTrace(System.out);
       }
   }
   
   
   public static void leerArchivo(String nombreArchivo){
       File archivo = new File(nombreArchivo);
       
       try {
           BufferedReader entrada = new BufferedReader(new FileReader(archivo));
           String lectura = entrada.readLine();
           while ( lectura != null){
               System.out.println(lectura);
              lectura = entrada.readLine();
           }
           entrada.close();

       } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
       } catch (IOException ex) {
          ex.printStackTrace(System.out);
       }
   }
   
   public static void eliminarArchivo(String nombreArchivo){
       File archivo = new File(nombreArchivo);
       System.out.println("" + archivo.exists());
       archivo.delete();
   }
   
   public static void reiniciar(String nombreArchivo){
       File archivo = new File(nombreArchivo);
       File archivo2 = new File("new.txt");
       
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            PrintWriter salida = new PrintWriter(archivo2);
            
            while((lectura = entrada.readLine())!= null){
                String[] p = lectura.split(","); 
                p[4] = "0";
                
                for (int i = 0; i < 7; i++) {
                    salida.print(p[i] + ",");
                }
                salida.print("\n");
            }
            salida.close();
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(archivo.delete() && archivo2.renameTo(archivo)){
            System.out.println("Exitoso");
        }
       
   }
   
   public static void cargartable(String nombreArchivo, DefaultTableModel model){
       File archivo = new File(nombreArchivo);
       
       
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            while((lectura= entrada.readLine())!= null){
                String[] p = lectura.split(","); 
                model.addRow(p);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManejoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}

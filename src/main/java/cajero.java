
import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class cajero {
  String usuario;
  int password;
  String password1;
  int intentos =0;
  int saldo;
  String cliente;
  
                 
  public static void main(String[] args) {
      int usuarios=0;
      int contraseña;
      String contraseña1;
      
      cajero usuario1 = new cajero();
      usuario1.usuario = "carolina";
      usuario1.password = 123;
      usuario1.saldo = 1000;
      usuario1.cliente = "frecuente";
      
      cajero usuario2 =new cajero();
      usuario2.usuario = "perla";
      usuario2.password = 321;
      usuario2.saldo = 1500;
      usuario2.cliente = "plus";
      
      cajero usuario3 = new cajero();
      usuario3.usuario = "maria";
      usuario2.password1 = "abc";
      usuario2.saldo = 500;
      usuario2.cliente = "casual";
      
      System.out.print("usuarios:\n1. carolin" +"\n2. perla" + "\n3. maria");
      System.out.print("\nque usuario eres: ");
      Scanner teclado = new Scanner (System.in);
      usuarios = teclado.nextInt();
      
      if (usuarios==1){
          System.out.print("contraseña: ");
          contraseña = teclado.nextInt();
          if (contraseña == usuario1.password){
              System.out.print("bienvenido");
              
          }else if (contraseña != usuario1.password){
                      System.out.print("usuario o contraseña incorrecta");
                      }
      }else {
          if (usuarios==2){
            System.out.print("contraseña: ");
            contraseña = teclado.nextInt();  
            if (contraseña == usuario2.password){
              System.out.print("bienvenido");
          }else if (contraseña != usuario2.password){
              System.out.print("usuario o contraseña incorrecta");
          }
                      
                      }else{
                          if (usuarios==3){
                              System.out.print("contraseña: ");
                              contraseña1 = teclado.nextLine();
                             if (contraseña1 == usuario3.password1){
                                 System.out.print("bienvenido");  
                           }else if (contraseña1 != usuario3.password1){
                                System.out.print("usuario o contraseña incorrecta");
   
                             }
             
              }
          
              
              
          }
              
      }
      
          
     
     
      
}
      
       

  }

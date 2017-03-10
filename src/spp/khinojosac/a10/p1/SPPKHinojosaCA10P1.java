/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.khinojosac.a10.p1;
import java.util.Scanner;
/**
 *
 * @author kevinhinojosa
 */
public class SPPKHinojosaCA10P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int [][] a,b,r;
        int tamano;
        tamano=solicitaEntero("Tamaño del arreglo");
        a=crearMatriz("a",tamano);
        b=crearMatriz("b", tamano);
        RestaMatrices(a,b);
        
     
     }
     public static int solicitaEntero(String mensaje){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int nentero=0;
        do{
            System.out.println("Introduce"+mensaje);
            try{
                nentero=kb.nextInt();
                flag=false;
                
            }
            catch(Exception ex){
                System.out.println("No es entero.Inténtalo de nuevo");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        return nentero;
     }

  public static int[][] crearMatriz(String a, int tamano) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce los elementos de la matriz" + a);
        int [][]miMatriz = new int [tamano][tamano];
        for (int[] miMatriz1 : miMatriz) {
            for (int j = 0; j < miMatriz1.length; j++) {
                miMatriz1[j] = solicitaEntero("el valor corresponiente");
            }
        }
        
     return miMatriz;
   }

     public static void RestaMatrices(int[][]a, int [][]b){
        
        int [][]r = new int[a.length][a.length];
        for (int i=0; i<r.length; i++){
            for (int j= 0; j<r[i].length; j++){
                r[i][j]= a[i][j]-b[i][j];
              
                System.out.println("El resultado es: " + r[i][j]);
            }   
        }   
    
    }
    }
    
    


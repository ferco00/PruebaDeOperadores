/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebadeoperadores;

/**
 *
 * @author Luis Fernando
 */
public class PruebaDeOperadores {
int x;
int y;
double z;
public void operaciones(){
    y=2;
    z=3.0;
    x=5;
    System.out.println(" x+ y+ z= "+(x+y+z));
    x+=y;
    y++;
    z--;
    z *=x;
    System.out.println(" x+ y+ z= "+(x+y+z));
    
}
    public static void main(String[] args) {
        PruebaDeOperadores resultado = new PruebaDeOperadores();
        resultado.operaciones();
    }
}

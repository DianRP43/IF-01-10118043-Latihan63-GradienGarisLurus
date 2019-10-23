/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan63.gradiengarislurus;

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat k1 = new Koordinat(2, 10, 5, 7);
        Koordinat k2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("garis yang melalui titik ("+k1.getX1()+","+""+k1.getX2()+") dan titik ("+""+k1.getY1()+","+k1.getY2()+") Memiliki Gradient "+k1.hitungGradient());
        System.out.println("garis yang melalui titik ("+k2.getX1()+","+""+k2.getX2()+") dan titik ("+""+k2.getY1()+","+k2.getY2()+") Memiliki Gradient "+k2.hitungGradient());
    }
    
}

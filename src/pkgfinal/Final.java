/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author hp
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row,col,space;
            // Jumlah baris
        for (row=1;row<=5;row++){
            // Print 1
            for (col=1;col<=1;col++){
                System.out.print("*");
            }
            // Menambahkan spasi
            for (space=1;space<=2;space++){
                System.out.print(" ");
            }
            // Print 5
            for (col=1;col<=5;col++){
                if ((row==1)
                 ||((row==3 || row==5) && (col<=4))
                  ||(row==2 && (col==1))
                  ||(row==4 && (col==5)))
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Menambahkan spasi
            for (space=1;space<=2;space++){
                System.out.print(" ");
            }
            // Print Y
            for (col=1;col<=5;col++){
                if ((row==1 && (col==1 || col==5))
                 || (row==2 && (col==2 || col==4))
                 || (row>=3 && (col==3)))
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    
}

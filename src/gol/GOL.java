/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol;

/**
 *
 * @author binaryBoy
 */
public class GOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameOfLife life = new GameOfLife();
        life.setLocationRelativeTo(null);
        life.show();
    }
    
}

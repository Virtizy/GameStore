/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasbesar;

/**
 *
 * @author LENOVO
 */
public class TugasBesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gameStore game = new gameStore();
        game.setVisible(false);
        
        login_page login = new login_page();
        login.setVisible(true);
    }
    
}
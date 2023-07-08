/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbesar;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class koneksi2 {
    public Properties mypanel, myLanguage;
    private String strNamePanel;
    public koneksi2(){}
    public String SettingPanel(String nmPanel){
        try{
            mypanel = new  Properties();
            mypanel.load(new FileInputStream("lib/database.ini"));
            strNamePanel = mypanel.getProperty(nmPanel);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e.getMessage(),
                "Error",JOptionPane.INFORMATION_MESSAGE);
        System.err.println(e.getMessage());
        System.exit(0);
        }
        return strNamePanel;
    }
}

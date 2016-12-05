/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import com.samkok.Cambodia;
import com.samkok.English;

public class Interface {

    public static void main(String[] args) {
        
        Cambodia cambodia = new Cambodia();
        English english = new English();
        
        System.out.println(cambodia.welcome());
        
        
    }
    
}

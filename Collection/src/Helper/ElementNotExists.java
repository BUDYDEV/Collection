/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/**
 *
 * @author Arsalan
 */
public class ElementNotExists extends Exception{
    @Override
    public String getMessage() {
        return "Element not exists";
    }
}
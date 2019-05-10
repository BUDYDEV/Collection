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
public class LinkedNode {
      public Object value;
      public LinkedNode next;
      public LinkedNode()
      {
      }
      public LinkedNode(Object value)
      {
        this.value = value;  
      }
      public LinkedNode(Object value,LinkedNode next)
      {
        this.value = value; 
        this.next = next;
      }
}

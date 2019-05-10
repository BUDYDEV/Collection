/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListType;

import Helper.CollectionAbstract;
import Helper.ElementNotExists;
import Helper.LinkedNode;

/**
 *
 * @author Arsalan
 */
public class Queue extends CollectionAbstract {   
    public LinkedNode first = null;
    public LinkedNode last = null;
    @Override
    public Object peek() throws ElementNotExists {
    synchronized (this) {
        if (this.Length == 0) {
          throw new ElementNotExists();   
        }
        return first.value;
    }
    }

    @Override
    public boolean equal(Stack temp) {
        if (this.Length == temp.Length) {
            LinkedNode temptt = first;
            LinkedNode tempst = temp.top;
            while(tempst != null)
            {
                if (temptt == null) {
                    return false;
                }
                if (tempst.value != temptt.value) {
                    return false;
                }
                tempst = tempst.next;
                temptt = temptt.next;
                
            }
            return true;
        }
        return false;
    }
    @Override
    public boolean equal(Queue temp) {
        if (this.Length == temp.Length) {
            LinkedNode temptt = first;
            LinkedNode tempst = temp.first;
            while(tempst != null)
            {
                if (temptt == null) {
                    return false;
                }
                if (tempst.value != temptt.value) {
                    return false;
                }
                tempst = tempst.next;
                temptt = temptt.next;
                
            }
            return true;
        }
        return false;
    }
    public void enqueue(Object i) {
     synchronized (this) {
        LinkedNode oldlast = last;
        last = new LinkedNode(i);
        last.next = null;
         if (first == null) 
         {
             first = last;
         }else
         {
           oldlast.next = last;  
         }
        this.Length++;
     }
    }

    public Object dequeue() throws ElementNotExists {
      synchronized (this) {
        if (this.Length == 0) {
          throw new ElementNotExists();   
        }
        LinkedNode temp = first;
        first = first.next;
        this.Length--;
         if (this.Length == 0) 
         {
                last = null;
         }
       return temp.value;
       }
    }

    
    
}

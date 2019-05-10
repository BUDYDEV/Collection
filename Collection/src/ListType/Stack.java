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
public class Stack extends CollectionAbstract{
    public int Length = 0;
    public LinkedNode top;
    /**
     *
     * @return
     * @throws Helper.ElementNotExists
     */
    @Override
    public Object peek() throws ElementNotExists {
        if (this.Length == 0) {
          throw new ElementNotExists();   
        }
        return top.value;
    }

    @Override
    public boolean equal(Stack temp) {
        if (temp.Length == this.Length) {            
            LinkedNode tempthis =temp.top;
            LinkedNode temptt =this.top;
            while(tempthis.next != null)
            {
                if (tempthis.value != temptt.value) {
                    return false;
                }
                tempthis = tempthis.next;
                temptt= temptt.next;
                if (temptt == null) {
                  return false;  
                }
            }
            return true;
        }
        return false;
    }
    @Override
    public boolean equal(Queue temp) {
        if (this.Length == temp.Length) {
            LinkedNode temptt = top;
            LinkedNode tempst = temp.first;
            while(tempst.next != null)
            {
                if (tempst.value != temptt.value) {
                    return false;
                }
                tempst = tempst.next;
                temptt = temptt.next;
                if (temptt == null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public void push(Object i) {
        LinkedNode obj = new LinkedNode(i,top);        
        top = obj;
        this.Length++;
    }

    public Object pop() throws ElementNotExists {
        if (this.Length == 0) {
          throw new ElementNotExists();   
        }
        LinkedNode temp = top;
        top = top.next;  
        this.Length--;
        return temp.value;
        
    }
    
}

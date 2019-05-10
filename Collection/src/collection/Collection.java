/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import Helper.ElementNotExists;
import ListType.Queue;
import ListType.Stack;

/**
 *
 * @author Arsalan
 */
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        try{
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("***********************");
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        }
        catch (ElementNotExists ex )
        {
              System.out.println(ex.toString());
        }
       System.out.println("***********************");
        Queue q1 = new Queue();
        Queue q2 = new Queue();
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s1.push(1);
        s1.push(2);
        s2.push(2);
        s2.push(3);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q2.enqueue(2);
        q2.enqueue(3);        

        try
        {
        System.out.println(q1.equal(s1));
        System.out.println(q1.equal(q2)); 
        System.out.println(s2.equal(s1));
        System.out.println(q2.equal(q2));
        s1.pop();
        s1.pop();
        s2.pop();
        s1.push(2);
        q1.dequeue();
        System.out.println(q1.equal(s1));
        System.out.println(q1.equal(q2)); 
        System.out.println(s2.equal(s1));
        System.out.println(q2.equal(q2));
        }
        catch (ElementNotExists ex )
        {
            System.out.println(ex.toString());
        }
        
    }
    }
    

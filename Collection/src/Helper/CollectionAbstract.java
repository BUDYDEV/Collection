/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import ListType.Queue;
import ListType.Stack;

/**
 *
 * @author Arsalan
 */
public abstract class CollectionAbstract {
    public int Length = 0;
    public abstract Object peek() throws ElementNotExists;

    /**
     *
     * @param temp
     * @return
     */
    public abstract boolean equal(Stack temp);
    public abstract boolean equal(Queue temp);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelist;

import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EAN
 */
public class DoubleListClassTest {
    
    public DoubleListClassTest() {
    }

    /**
     * Test of IsEmpty method, of class DoubleListClass.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        DoubleListClass instance = new DoubleListClass();
        boolean expResult = true;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of Empty method, of class DoubleListClass.
     */
    @Test
    public void testEmpty() {
        System.out.println("Empty");
        DoubleListClass instance = new DoubleListClass();
        instance.Empty();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DoubleListClass.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        DoubleListClass instance = new DoubleListClass();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class DoubleListClass.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object element = null;
        DoubleListClass instance = new DoubleListClass();
        int expResult = 0;
        int result = instance.find(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DoubleListClass.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object element = null;
        DoubleListClass instance = new DoubleListClass();
        Object expResult = null;
        Object result = instance.delete(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class DoubleListClass.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = null;
        DoubleListClass instance = new DoubleListClass();
        boolean expResult = false;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of substitute method, of class DoubleListClass.
     */
    @Test
    public void testSubstitute() {
        System.out.println("substitute");
        Object currentElement = null;
        Object newElement = null;
        DoubleListClass instance = new DoubleListClass();
        instance.substitute(currentElement, newElement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class DoubleListClass.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        DoubleListClass instance = new DoubleListClass();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

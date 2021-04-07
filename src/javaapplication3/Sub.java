/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author mehab
 */
public class Sub extends Circle{
    
    public Sub(int num) {
                super(num);
        System.out.println("from SUB_Class");
    }

    @Override
    public int getCounterStatus() {
        return super.getCounterStatus(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

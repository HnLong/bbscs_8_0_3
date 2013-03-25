/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author LongMin
 */
public class TestBreak {  
 
   public static void main(String[] args) {  
        boolean isGo = true;  
        for(int a = 0;a < 100 && isGo;a++){  
            for(int b = 0;b < 100 && isGo;b++){  
                for(int c = 0;c < 100 && isGo;c++){  
                    System.out.println(a  + "-" + b + "-" + c);  
                    isGo = false;  
                }  
            }  
        }  
    }  
}  
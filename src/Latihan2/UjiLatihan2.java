/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author PC
 */
public class UjiLatihan2 {
      public static void main(String[] args){
          Line L1=new Line(1,3,5,7);
          L1.getLength();
          L1.isGreater(L1, L1);
          L1.isLess(L1, L1);
          L1.isEqual(L1, L1);
          System.out.println("isGreater :"+L1.isGreater(L1, L1));
           System.out.println("isLess :"+L1.isLess(L1, L1));
            System.out.println("isEqual :"+L1.isEqual(L1, L1));
             System.out.println("Length :"+L1.getLength());
      }
}

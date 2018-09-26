/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author PC
 */
public class AeroPlane extends Vehicle {
    public void walk(){
        System.out.println("Aeroplane is flying");
    }
    public static void main(String[] args){
    AeroPlane Garuda = new AeroPlane();
    Garuda.function();
    Garuda.fuel();
    Garuda.walk();
}
}

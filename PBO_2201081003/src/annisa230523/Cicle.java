/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annisa230523;

/**
 *
 * @author Slime1
 */
public class Cicle extends shape {
    
    private double radius;
    
    public Cicle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getName() {
        return "Cicle";
    }
}

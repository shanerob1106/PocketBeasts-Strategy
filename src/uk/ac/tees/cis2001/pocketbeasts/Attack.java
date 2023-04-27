/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author shane
 */
public class Attack implements AttackInterface{
    
    protected int health;
    
    public Attack(){
    
    }

    @Override
    public boolean damage(int amount) {
        this.health -= amount;
        return this.health <= 0;
    }
    
}

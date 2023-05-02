/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author shane
 */
public class QuickAttack implements AttackInterface{

    private int attack;
    
    @Override
    public int performAttack(int availableMana) {
        if(availableMana >= 1) {
            this.attack = 1;
            System.out.println("You attack with " + this.attack);
        } else {
            // Not enough mana for this attack
            System.out.println("Not enough mana to attack ");
            this.attack = 0;
        }
        return this.attack;
    }
}

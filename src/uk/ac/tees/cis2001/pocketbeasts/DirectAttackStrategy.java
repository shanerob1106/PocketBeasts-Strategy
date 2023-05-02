/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author shane
 */
public class DirectAttackStrategy implements AttackInterface{

    @Override
    public void performAttack(int availableMana) {
        if(availableMana >= 2) {
            // Perform a direct damage attack
        } else { 
            // Not enough mana for this attack
        }
    }
}

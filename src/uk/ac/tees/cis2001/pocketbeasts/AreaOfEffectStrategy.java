/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author shane
 */
public class AreaOfEffectStrategy implements AttackInterface{

    @Override
    public void performAttack(int availableMana) {
        if(availableMana >= 3) {
            // Perform an area of effect attack 
        } else {
            // Not enough mana for this attack
        }
    }
}

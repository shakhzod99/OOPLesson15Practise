package Lesson18Generics;

import Lesson15.Archer;
import Lesson15.Hero;
import Lesson15.Warrior;
import Lesson18Generics.weapon.Bow;
import Lesson18Generics.weapon.Sword;

public class WeaponRunner {
  public static void main(String[] args) {
    Archer<Bow> archer = new Archer<>("Леголас", 15);
    archer.setWeapon(new Bow());

    Warrior<Sword> warrior = new Warrior<>("Урса", 12);
    warrior.setWeapon(new Sword());

    printWeaponDamage(warrior);
  }

  public static void printWeaponDamage(Hero<Sword> hero) {
    Sword weapon = hero.getWeapon();
    hero.setWeapon(new Sword());
    System.out.println(hero.getWeapon().getDamage());
  }
}

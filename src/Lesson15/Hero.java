package Lesson15;

import Lesson18Generics.weapon.Weapon;

/**
 * 1.Создать класс Hero, представляющий собой героя и содержащий поле name.
 *    Добавить конструктор, принимающий имя героя и геттер для имени (сеттер не нужен).
 *    Добавить метод attackEnemy(), выводящий в консоль сообщение о том,
 *  что герой атакует врага.
 *    Создать класс TrainingGround, содержащий метод main. Протестировать
 *  создание героя и его атаку.
 */
public abstract class Hero<T extends Weapon> {
  private String name;
  private int damage;
  private T weapon;

  public Hero(String name, int damage) {
    this.name = name;
    this.damage = damage;
  }
  public abstract void attackEnemy(Enemy enemy);

  public String getName() {
    return name;
  }
  public int getDamage() {
    return damage;
  }

  public T getWeapon() {
    return weapon;
  }

  public void setWeapon(T weapon) {
    this.weapon = weapon;
  }
}

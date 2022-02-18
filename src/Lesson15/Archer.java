package Lesson15;

import Lesson18Generics.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T>{

  private Wolf wolf;

  public Archer(String name, int damage) {
    super(name, damage);
    this.wolf = new Wolf("Волк Эллиот", 10);
  }

  @Override
  public void attackEnemy(Enemy enemy) {
    System.out.println(getName() +" стрельнул из лука в " + enemy.getName());
    wolf.attackEnemy(enemy);
  }

  public class Wolf{
    private String name;
    private int damage;

    public Wolf(String name, int damage) {
      this.name = name;
      this.damage = damage;
    }
    public void attackEnemy(Enemy enemy){
      System.out.println(name + " и " + Archer.this.getName()+" наносят совместный урон");
      enemy.takeDamage(damage + Archer.this.getDamage());
    }
  }
}

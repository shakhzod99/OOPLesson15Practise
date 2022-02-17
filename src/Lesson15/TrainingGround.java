package Lesson15;

/**1
 *  Создать класс TrainingGround, содержащий метод main. Протестировать
 *  создание героя и его атаку.
 */
public class TrainingGround {
  public static void main(String[] args) {
    Hero warrior = new Warrior("Артур", 25);
    Hero mage = new Mage("Мерлин", 45);
    Hero archer = new Archer("Леголас", 12);

    Enemy enemy = new Enemy("Дементор", 120);
    attackName(enemy, mage, warrior, archer);
  }
  public static void attackName(Enemy enemy, Hero... heroes){
    while (enemy.isAlive()){
      for (Hero hero : heroes) {
        if (enemy.isAlive()){
          hero.attackEnemy(enemy);
        }
      }
    }
  }
}

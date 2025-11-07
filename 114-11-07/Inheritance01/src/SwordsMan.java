public class SwordsMan extends Role {

    public SwordsMan(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public void attack(Role opponent) {
        opponent.setHealth(opponent.getHealth() - this.getAttackPower());
        if (opponent.getHealth() < 0) opponent.setHealth(0);
        System.out.println(this.getName() + " 揮劍攻擊了 " + opponent.getName() +
                "，造成了 " + this.getAttackPower() + " 點傷害。");
    }
}

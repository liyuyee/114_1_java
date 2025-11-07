public class Magician extends Role {
    private int healPower;

    public Magician(String name, int health, int attackPower, int healPower) {
        super(name, health, attackPower);
        this.healPower = healPower;
    }

    public void attack(Role opponent) {
        opponent.setHealth(opponent.getHealth() - this.getAttackPower());
        if (opponent.getHealth() < 0) opponent.setHealth(0);
        System.out.println(this.getName() + " 使用魔法攻擊了 " + opponent.getName() +
                "，造成了 " + this.getAttackPower() + " 點傷害。");
    }

    public void heal(Role ally) {
        ally.setHealth(ally.getHealth() + healPower);
        System.out.println(this.getName() + " 對 " + ally.getName() +
                " 使用了治癒術，恢復了 " + healPower + " 點生命值。");
    }
}


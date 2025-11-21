public abstract class Role {
    protected String name;
    protected int health;
    protected int attackPower;

    public Role(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0) health = 0;
        System.out.println(name + " 受到 " + dmg + " 傷害，剩餘生命：" + health);
    }

    // ===== 抽象方法 =====
    public abstract void showSpecialSkill();
    public abstract void prepareBattle();
    public abstract void afterBattle();

    // ===== 一般攻擊行為 =====
    public void attack(Role target) {
        System.out.println(name + " 攻擊了 " + target.getName() + "!");
        target.takeDamage(attackPower);
    }
}

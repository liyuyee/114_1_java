public class Magician extends Role {

    private int magicPower;
    private int healPower;

    public Magician(String name, int health, int attackPower, int healPower) {
        super(name, health, attackPower);
        this.magicPower = attackPower;
        this.healPower = healPower;
    }

    @Override
    public void showSpecialSkill() {
        System.out.println("✨ " + name + " 的技能：魔法彈 & 治癒術");
    }

    @Override
    public void prepareBattle() {
        System.out.println(name + " 集中精神，魔力正在流動！");
    }

    @Override
    public void afterBattle() {
        System.out.println(name + " 恢復魔力。");
    }

    public void heal(Role target) {
        int healAmount = healPower + (int)(Math.random() * 5);
        System.out.println(name + " 對 " + target.getName() + " 使用治癒術，恢復 " + healAmount + " 生命！");
        target.health += healAmount;
    }

    @Override
    public void attack(Role target) {
        System.out.println(name + " 發射魔法彈攻擊 " + target.getName() + "!");
        target.takeDamage(magicPower);
    }
}

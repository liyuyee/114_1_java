public class ShieldSwordsMan extends SwordsMan {

    private int defencePower;
    private boolean isDefending = false;

    public ShieldSwordsMan(String name, int health, int attackPower, int defencePower) {
        super(name, health, attackPower);
        this.defencePower = defencePower;
    }

    @Override
    public void showSpecialSkill() {
        System.out.println("🛡️ " + name + " 的技能：盾牌格擋（減少傷害）");
    }

    public void defence() {
        isDefending = true;
        System.out.println(name + " 舉起盾牌！本回合傷害減免 " + defencePower);
    }

    @Override
    public void takeDamage(int dmg) {
        if (isDefending) {
            dmg -= defencePower;
            if (dmg < 0) dmg = 0;
            isDefending = false;
        }
        super.takeDamage(dmg);
    }

    @Override
    public void prepareBattle() {
        System.out.println(name + " 調整盾牌角度，準備迎擊！");
    }

    @Override
    public void afterBattle() {
        System.out.println(name + " 檢查盾牌是否受損。");
    }
}

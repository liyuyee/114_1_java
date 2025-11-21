public class SwordsMan extends Role {

    public SwordsMan(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void showSpecialSkill() {
        System.out.println("🗡️ " + name + " 的技能：劍氣斬（高傷害單體攻擊）");
    }

    @Override
    public void prepareBattle() {
        System.out.println(name + " 握緊手中的劍，準備迎接戰鬥！");
    }

    @Override
    public void afterBattle() {
        System.out.println(name + " 在戰鬥後整理武器。");
    }
}

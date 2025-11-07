public class RPG {
    public static void main(String[] args) {

        // 建立角色
        SwordsMan swordsMan = new SwordsMan("亞瑟", 100, 20);
        Magician magician = new Magician("梅林", 80, 15, 25);

        System.out.println("=== 戰鬥開始！ ===");

        // 第 1 回合：劍士攻擊魔法師
        swordsMan.attack(magician);
        System.out.println(magician.getName() + " 剩餘血量：" + magician.getHealth());

        // 第 2 回合：魔法師反擊
        magician.attack(swordsMan);
        System.out.println(swordsMan.getName() + " 剩餘血量：" + swordsMan.getHealth());

        // 第 3 回合：魔法師治療自己
        magician.heal(magician);
        System.out.println(magician.getName() + " 治療後血量：" + magician.getHealth());

        System.out.println("=== 戰鬥結束！ ===");
    }
}


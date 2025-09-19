import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCount = 0;

        System.out.println("輸入完成請按ctrl-z離開(Windows)或ctrl-d(Mac/Linux)結束輸入\n ");

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                int grade = input.nextInt();
                total += grade;
                gradeCount++;
            } else {
                System.out.println("輸入非整數，已跳過，請繼續輸入下一筆成績。");
                input.next(); // 跳過錯誤輸入
            }
        }

        if(gradeCount != 0) {
            double average = (double) total / gradeCount;
            System.out.printf("班級總分: %d\n", total);
            System.out.printf("班級人數: %d\n", gradeCount);
            System.out.printf("班級平均: %.2f\n", average);
        } else {
            System.out.println("沒有輸入任何成績。");
        }
    }
}

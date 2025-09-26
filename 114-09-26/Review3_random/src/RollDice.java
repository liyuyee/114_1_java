import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args) {
        SecureRandom randomNumbers= new SecureRandom();

        int[] frequency = new int[7];

        for(int roll = 0; roll < 60000000; roll++) {
            int face = randomNumbers.nextInt(6) + 1;
            frequency[face]++;
        }

        System.out.printf("%s%10s%n", "點數", "出現次數");
        for(int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
}

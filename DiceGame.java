import java.util.Random;
class DiceGame{
    public static void main(String[] args){
        int[] dice = {1, 2, 3, 4, 5, 6};
        int total = 0;

        Random r = new Random();
        System.out.println("Rolling dice...");
        for(int i = 1; i <= 2; i ++){
            int num = dice[r.nextInt(6)];
            total += num;
            System.out.println("Die " + i + ": " + num);
        }
        System.out.println("Total value: "  + total);
    }
}

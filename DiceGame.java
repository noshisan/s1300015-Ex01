import java.util.Scanner;
import java.util.Random;
class DiceGame{
    public static void main(String[] args){
        int[] dice = {1, 2, 3, 4, 5, 6};
        int total = 0;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        Random r = new Random();
        System.out.println("Rolling dice...");
        for(int i = 1; i <= 2; i ++){
            int num = dice[r.nextInt(6)];
            total += num;
            System.out.println("Die " + i + ": " + num);
        }
        System.out.println("Total value: "  + total);

        if(total > 7){
            System.out.println(name + "won");
        }
        else{
            System.out.println(name + "lost");
        }
    }
}

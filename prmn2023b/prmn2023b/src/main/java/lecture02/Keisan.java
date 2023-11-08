package lecture02;

import java.util.Scanner;
import java.util.Arrays;
public class Keisan {

    Scanner input = new Scanner(System.in);
    int sum(int num[]){
        return Arrays.stream(num).sum();
    }

    void sum_judge(int sum){
        if (sum >= 100){
            System.out.println("great");
        } else if (sum >= 50) {
            System.out.println("big");
        } else {
            System.out.println("small");
        }
    }
}

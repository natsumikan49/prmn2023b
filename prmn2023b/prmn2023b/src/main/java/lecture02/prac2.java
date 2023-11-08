package lecture02;
import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        int[] num = new int[5];
        int x = 0;

        Scanner input = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.printf("数字%dつ目", i);
            num[i] = input.nextInt();
        }

        Keisan calc = new Keisan();
        x = calc.sum(num);
        System.out.println("合計値：" + x);
        calc.sum_judge(x);

    }
}

package lecture02;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {

        String[][] num_pass = new String[5][];
        String[][] jnum_pass = new String[2][];

        num_pass[0] = new String[2];
        num_pass[1] = new String[2];
        num_pass[2] = new String[2];
        num_pass[3] = new String[2];
        num_pass[4] = new String[2];

        jnum_pass[0] = new String[2];
        jnum_pass[1] = new String[2];

        Scanner input = new Scanner(System.in);
        for (int i=0; i<5; i++){
            for (int j=0; j<2; j++){
                System.out.print(i + "番目のNo." + j + "：");
                num_pass[i][j] = input.next();
            }
        }

        System.out.println("判定したい学籍、パスワードを入力します");
        for (int j=0; j<2; j++){
            System.out.print("No." + j + "：");
            jnum_pass[0][j] = input.next();
        }

        Gakuseki2 g2 = new Gakuseki2();

        g2.judge(num_pass, jnum_pass);

    }
}

package lecture02;

import java.util.Scanner;

public class Gakuseki {

    void judge(String number) {
        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください:");
        String gakuseki = scan.next();

        if (number.equals(gakuseki)) {
            System.out.println("complate!!");
        } else {
            System.out.println("error!!");
        }
    }


}



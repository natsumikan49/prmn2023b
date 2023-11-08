package lecture02;

public class Gakuseki2 {

    void judge(String[][] num_pass, String[][] j_num_pass){
        for (int i=0; i<num_pass.length; i++){
            if (j_num_pass[0][0].equals(num_pass[i][0])){
                if (j_num_pass[0][1].equals(num_pass[i][1])){
                    System.out.println("ログイン完了");
                } else {
                    System.out.println("不正なアクセス");
                    System.exit(0);
                }
            } else {
                System.out.println("error");
                System.exit(0);
            }
        }
    }
}

import java.util.Scanner;

public class Main {
// id:106021218
// name:劉韋祥
// date:20170930
// purpose:英哩轉公里

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 =scn.nextInt();
        System.out.println((double)Math.round(v1*1.6f*10)/10f);
    }
}

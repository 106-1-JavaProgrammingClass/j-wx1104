import java.util.Scanner;

public class HW2 {
// id:106021218
// name:劉韋祥
// date:20170930
// purpose:攝氏轉華氏

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int C = scn.nextInt();
        System.out.println(Math.round(C*9/5f+32));
    }
}

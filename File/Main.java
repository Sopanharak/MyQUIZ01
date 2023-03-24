package File;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("-----Menu----\n 1.Register \n 2.ResetPassword \n3.Test your typing speed \n4. Result");
        int option = sc.nextInt();
        switch(option){
            case 1 : Register.main(args);
            break;
            case 2 : ResetPw.main(args);
            break;
            case 3 : usertyping.main(args);
            break;
            case 4 : ResultList.main(args);
            break;
        }

    }
}

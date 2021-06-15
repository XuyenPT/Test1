import java.util.Scanner;

public class Bai2 {
    static void checkpass() {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Nhập mật khẩu:");
        String str = scanner.nextLine();
        if (str.length()<10){
            System.out.println("Mật khẩu yếu");
            return;
        }
        boolean cochuhoa = false;
        for (int i = 0; i< str.length();i++){
            String pass = String.valueOf(str.charAt(i));
            if(pass.equals(pass.toUpperCase())){
                cochuhoa=true;
                break;
            }

        }
        if(cochuhoa!=true){
            System.out.println("Mật khẩu chưa đủ mạnh");
            return;
        }
        boolean cochuso = false;
        for (int i = 0; i< str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                cochuso=true;
                break;
            }

        }
        if(cochuso!=true){
            System.out.println("Mật khẩu chưa đủ mạnh");
            return;
        }
        boolean cokitudacbiet = false;
        for (int i = 0; i< str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                cokitudacbiet=true;
                break;
            }

        }
        if(cokitudacbiet!=true){
            System.out.println("Mật khẩu chưa đủ mạnh");
            return;
        }
    }

}

public class Bai1 {
    public void demTuInHoa() {
        String s = "You Only Live Once. But if You do it right. once is Enough";
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                dem++;
            }
        }
        System.out.println("Tổng số ký tự tự viết hoa là: " + dem);
        String[] arr = s.split("");
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                arr[i] = String.valueOf(s.charAt(i)).toUpperCase();
            }
        }
        for (String a : arr) {
            System.out.print(a);
        }
    }
    }
}


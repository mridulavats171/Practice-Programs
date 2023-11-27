package Recursion;

public class MobilePatterns {
    public static void main(String[] args) {
        pattern("", "12");
    }

    public static void pattern(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int num =  up.charAt(0) - '0';
        for(int i = (num-1) *3; i < num*3; i++){
            char ch = (char) ('a' + i);
            pattern(p+ch, up.substring(1));
        }
    }
}

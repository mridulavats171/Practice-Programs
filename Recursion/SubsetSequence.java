package Recursion;

public class SubsetSequence {
    public static void main(String[] args) {
        subSet("", "abc");
    }

    private static void subSet(String a, String abc) {
        if(abc.isEmpty()){
            System.out.println(a);
            return;
        }
        subSet(a + abc.charAt(0),abc.substring(1));
        subSet( a ,abc.substring(1));
    }
}

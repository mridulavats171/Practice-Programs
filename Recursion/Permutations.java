package Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permuitations("", "abcd");
        ArrayList<String> lsi = permuitationsList("", "hsb");
    }

    static void permuitations(String a, String up){
        if(up.isEmpty()){
            System.out.println(a);
            return;
        }
        char ch =  up.charAt(0);

        for(int i=0; i<= a.length(); i++){
            String f = a.substring(0,i);
            String l= a.substring(i, a.length());
            permuitations(f+ ch + l, up.substring(1));
        }
    }

    static ArrayList<String> permuitationsList(String a, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(a);
            return list;
        }
        char ch =  up.charAt(0);
        ArrayList<String> ans =  new ArrayList<>();
        for(int i=0; i<= a.length(); i++){
            String f = a.substring(0,i);
            String l= a.substring(i, a.length());
            ans.addAll(permuitationsList(f+ ch + l, up.substring(1)));
        }
        return ans;
    }
}

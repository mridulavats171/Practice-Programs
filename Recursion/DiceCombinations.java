package Recursion;

public class DiceCombinations {
    public static void main(String[] args) {
    dicecombo("", 4);
    }

    public static void dicecombo(String num, int target){
        if(target==0){
            System.out.println(num + "");
            return;
        }
        for(int i=1; i<=6 && i<=target; i++){
            dicecombo(num+ i, target-i);
        }
    }
}

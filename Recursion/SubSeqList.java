package Recursion;

import org.w3c.dom.ls.LSInput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SubSeqList {
    public static void main(String[] args) {
        int[] array =  {1,2,3,5};
        List<List<Integer>> ans= subset(array);
        for (List<Integer> list: ans){
            System.out.print(list);
        }
    }

    public static List<List<Integer>> subset(int[] array){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: array){
            int n = outer.size();
            for(int i=0; i<n; i++){
                List<Integer> inner= new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }

        }
        return outer;
    }
}

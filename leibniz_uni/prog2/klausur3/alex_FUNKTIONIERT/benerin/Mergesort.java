import java.lang.*;
import java.util.*;

public class Mergesort{

    public static <T extends Comparable<? super T>> void mergesort (List<T> value) {
        
        ArrayList<T> left = new ArrayList<>();
        ArrayList<T> right = new ArrayList<>();
        boolean toggle = true;
        
        if(value.size() > 1) {
            while (!value.isEmpty()) {
                if(toggle) left.add(left.remove(0));
                else right.add(right.remove(0));
                toggle = !toggle;
            }
        }
        mergesort(left);
        mergesort(right);
        value.addAll(sorting(left,right));
    
    }

    public static <T extends Comparable<? super T>> List<T> sorting (List<T> left , List<T> right){
        ArrayList<T> input = new ArrayList<>();
        if(!left.isEmpty() && !right.isEmpty()) {
            if(left.get(0).compareTo(right.get(0)) <= 0) input.add(left.remove(0));
            else input.add(right.remove(0));
        }
        input.addAll(left);
        input.addAll(right);
        return input;
    }


}
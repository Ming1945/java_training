import.java.lang.*;

public class Sort {

    public static <T extends Comparable <? super T>> void mergesort (List<T> value) {
        List<T> left = new ArrayList<T>();
        List<T> right = new ArrayList<T>();
        boolean toggle = true;
        if(value.size() > 1){
            while (!value.isEmpty()) {
                if(toggle) left.add(value.remove(0));
                else right.add(value.remove(0));
                toggle = !toggle;
            }
        }
        mergesort.(left);
        mergesort.(right);
        value.addAll(sorting(left,right));
    } 

    public static <T extends Comparable<? super T>> List<T> sorting (List<T> left , List<T> right){
        List<T> result = new ArrayList<T>();
        while(!left.isEmpty() && !right.isEmpty()) {
            if(left.get(0).compareTo(right.get(0)) <= 0) result.add(left.remove(0));
            else result.add(right.remove(0));
        }
        result.addAll(left);
        result.addAll(left);
        return result;
    }

}
import java.util.*;
import java.lang.*;


public class MergeSort { //for ArrayList

    static <T extends Comparable<? super T>> List<T> merge (List<T> left, List<T> right) { //? compatible dengan T
        List<T> merged = new ArrayList<T>();
        while (!left.isEmpty() && !right.isEmpty()) { //ketika left dan right tidak kosong
            // add , get , remove itu typedata nya int jadi harus pake parameter sedangkan pop , peek itu void jadi bisa allgemein
            if (left.get(0).compareTo(right.get(0)) <= 0) { //compare index 0 left sama index 0 right, kalau nilainya minus atau 0 , maka 
                merged.add(left.remove(0)); //ngambil element node pertama dari list left lalu masukin ke merged , index setelah 0 kini menjadi index pertama which is index 0
            } else {
                merged.add(right.remove(0));
            }
        }
        merged.addAll(left); //element kiri yang udah di sort sekarang dikumpulin semua PERTAMA KALI di merged  
        merged.addAll(right); //setelah yang kiri masuk semua , sekarang masukin element kanan yang udah di sort
        return merged; //isi sort sekarang element kiri dan kanan yang udah di sort
    }

    static <T extends Comparable<? super T>> void mergeSort(List<T> input) {
        if (input.size() != 1) { //kalau panjang input ngga 1 , maka bikin list kiri dan list kanan baru
            List<T> left = new ArrayList<T>(); //bikin list baru kiri
            List<T> right = new ArrayList<T>();
            boolean logicalSwitch = true;// boolean used to decide if we put elements in left or right LinkedList
            while (!input.isEmpty()) { //ketika input ngga kosong maka
                if (logicalSwitch) {    //kalau logicalSwitch nya true maka masukin element random ke list kiri
                    left.add(input.remove(0));
                } else {
                    right.add(input.remove(0)); //masukin random elemet ke list kanan
                }
                logicalSwitch = !logicalSwitch; //logicalswitch yang nilainya nanti bakal true atau false
            }
            mergeSort(left); //list kiri , dibelah jadi list kiri dan kanan lagi usw sampe mampus
            mergeSort(right); //list kanan , dibelah jadi list kiri dan kanan lagi usw sampe mampus
            input.addAll(merge(left, right)); //sekarang masukin parameter list kiri dan list kanan ke method merge trs masukin lagi ke input..inilah hasil mergesort yang sempurna
        }
    }
}
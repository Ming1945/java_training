package klausur1;

import java.util.*;
import sort.*;

class Main {
    public static void main(String[] args) {
        List<Eimer> eimers = new ArrayList<Eimer>();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(20) + 1;
            eimers.add(new Eimer(n));
        }

        Sort.mergeSort(eimers);
        for (Eimer eimer : eimers) {
            System.out.println(eimer);
        }
    }
}
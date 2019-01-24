package klausur2;

import java.util.*;
import sort.*;

class Main {
    public static void main(String[] args) {
        Vector<Auto> autos = new Vector<Auto>();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(500) + 500;
            autos.add(new Auto(n));
        }

        Sort.mergeSort(autos);
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}
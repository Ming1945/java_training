import java.util.*;


public class Main {

    public static <T extends HatHoehe> T binaereSuche(ArrayList<T> list, T x, int a, int b) {
    if (b != a) {
        int mid = (a+b) / 2;
        T m = list.get(mid);
        if (x.getHoehe() == m.getHoehe()) {
            return m;
        }
        if (x.getHoehe() < m.getHoehe()) {
            return binaereSuche(list, x, a, mid);
        }
        if (x.getHoehe() > m.getHoehe()) {
            return binaereSuche(list, x, mid + 1, b);
        }
    }
    return null;
} 

    public static void main(String[] args) {
        ArrayList<Haus> list = new ArrayList<Haus>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(193) + 7;
            list.add(new Haus("Haus " + (i + 1), n));
        }
        list.add(new Haus("Haus Otto", 50)); //falsch
        System.out.println("Zufaellig geordnete Liste: "); //GEORDNETE!!!!!
        for (Haus haus : list) {
            System.out.println(haus);
        }
        MergeSort.mergeSort(list); //taro diatas
        System.out.println("erweiterte Liste: "); //Baca beispiel
        for (Haus haus : list) {
            System.out.println(haus);
        }
        Haus suchhaus = new Haus("Suchhaus", 50);
        System.out.println("Suche: Haus " + suchhaus.name + " mit Hoehe " + suchhaus.hoehe);
        Haus gefunden = binaereSuche(list, suchhaus, 0, list.size());
        if (gefunden != null) {
            System.out.println("Gefunden: " + gefunden);
        }
        else {
            System.out.println("Kein entsprechendes Haus gefunden!");
        }

    }
}
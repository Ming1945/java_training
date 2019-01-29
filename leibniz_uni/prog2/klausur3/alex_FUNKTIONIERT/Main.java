import java.util.*;

public class Main {

//================================BINARY SEARCH METHOD========================================
    public static <T extends HatHoehe> T BinarySearch(ArrayList<T> list , T x , int left , int right){
        //ArrayList<T> = ini masih list,jadi harus tau index ke berapa buat ambil objeknya lalu baru bisa dpt hohenya
        //T x = ini udah objek,einfach tinggal gethohe lalu dapet tingginya
        int mid = (left+right) / 2;
        T indexMid = list.get(mid);
        if (left == right) {
            return null;
        }
        else if(x.getHoehe() == indexMid.getHoehe()) return x;
        else if(x.getHoehe() < indexMid.getHoehe()) return BinarySearch(list , x , left , mid);
        else return BinarySearch(list , x , mid+1 , right);
    }

    public static void main (String[] args) {

//==================================INITALISIERUNG=============================================
        
        Random rand = new Random(); //method Random ya typedatanya Random juga bukan int !!
        ArrayList<Haus> rumah = new ArrayList<Haus>(); //lu mau bikin Haus baru , ya di dalem generik nya harus Haus juga. BOTH <Haus>
        
        for(int i = 0 ; i < 10 ; i++){ //dia minta cuma 10 rumah
            int rng = rand.nextInt(193) + 7; //mulai dari angka 7 sampe angka 200 , selisihnya 193 angka
            rumah.add(new Haus( "" + (i + 1) , rng));
        }

//====================================RANDOM HOUSES=======================================
        
        System.out.println("");
        System.out.println("Random houses :");
        for (Haus forRandomHouses : rumah) { //untuk variabel egal bertipe objek Haus sama dengan rumah
            System.out.println(forRandomHouses);
        }
        
//=====================================SORTED HOUSES===========================================
        
        MergeSort.mergeSort(rumah);
        //Collections.sort(rumah); //this is CHEAT LOL
        System.out.println("");
        System.out.println("Sorted houses :");
        for (Haus forSortedHouses : rumah) { //untuk variabel egal bertipe objek Haus sama dengan rumah
            System.out.println(forSortedHouses);
        }

//=====================================EXTENDED HOUSES=========================================
    
        //System.out.println(rumah.get(0)); ini artinya lu minta objek dari index ke 0 , dia print objek yang punya isi String dan int
        //makanya kita ada methode gethoehe di haus. pake itu biar bisa ambil tinggi bangunan nya aja

        int smallHoehe = rumah.get(0).getHoehe() - 1; //bikin hoehe yang 1 meter lebih pendek dari yang terpendek
        int bigHoehe = rumah.get(9).getHoehe() + 1; 
        /*
        kalau udah tau index terakhirnya 9 , bisa gini , sonst pake ini
        int right = rumah.size()-1;
        int bigHoehe = rumah.get(right).getHoehe() + 1;
        */

        Haus smallest = new Haus("SMALLEST" , smallHoehe);
        Haus biggest = new Haus("BIGGEST" , bigHoehe);

        rumah.add(smallest); //skrg di add ke dalem list
        rumah.add(biggest);
        
        MergeSort.mergeSort(rumah); //sorting lagi karena yang tadi dimasukin ke dalem list itu bakal masuk ke tail list

        System.out.println("");
        System.out.println("Extended houses :");
        for (Haus forExtendedHouses : rumah) { //untuk variabel egal bertipe objek Haus sama dengan rumah
            System.out.println(forExtendedHouses);
        }
        
//=================================BINARY SEARCH HOUSES=========================================

        int lastIndex = rumah.size(); //kalau + 1 out of bounds which is 13
        Haus gesuchteHaus = new Haus( "gesuchteHaus" , 145);
        
        System.out.println("");
        System.out.println("Binary Search Houses : ");
        System.out.println("Suche : " + BinarySearch(rumah , smallest , 0 , lastIndex));
        System.out.println("Suche : " + BinarySearch(rumah , biggest , 0 , lastIndex));
        System.out.println("Suche : " + BinarySearch(rumah , gesuchteHaus , 0 ,lastIndex));
        System.out.println("Suche : " + BinarySearch(rumah , rumah.get(4) , 0 , lastIndex));

//==============================================================================================

    }

}
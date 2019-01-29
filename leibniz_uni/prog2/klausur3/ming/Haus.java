import java.lang.*;

public class Haus implements HatHoehe , Comparable<Haus> {

    String[] name;
    int hohe;

    public Haus(String[] name , int hohe) {
        this.name = name;
        this.hohe = hohe;
    }

    public int getHohe(){ //harus diinisialisasi juga karna Haus udah implements HatHoehe. jadi methode dan parameter nya harus ditulis persis dan dihubungkan
        return this.hohe;
    }
    
    public void setHohe(int hohe){
        this.hohe = hohe; //ngeset current hohe dengan parameter hohe
    }

    public boolean istHoeher(HatHoehe other){
        if(this.hohe > other.hohe) return true;
        return false;
    }

    public int compareTo(Haus current) {
        return this.hohe - current.hohe;
    }

    @Override
    public void toString(){
        return "House " + name + " has " + hohe + " liter." ;
    }

}
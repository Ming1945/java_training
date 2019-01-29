
public class Haus implements HatHoehe , Comparable<Haus> { //why implements?why not extends HatHoehe?

    int hoehe;
    String name;

    public Haus (String name , int hoehe) { //jangan sampe lupa ini penting sonst lu gabisa bikin rumah baru , nama Haus harus sama dengan nama kelasnya Haus   
        this.name = name;
        this.hoehe = hoehe;
    }
   
    public int getHoehe(){
        return this.hoehe;
    }

    public void setHoehe(int tinggi) {
        this.hoehe = tinggi;
    }

    public boolean istHoeher(HatHoehe h) {
        if(this.hoehe < h.getHoehe()) return true; //kalau tinggi aktuelles objekt lebih tinggi maka return true
        return false; 
    }

    public int compareTo (Haus s){
        return this.hoehe - s.hoehe;
    }
    
    
    public String toString() { //public String toString() return String ini bukan void
        return "Haus " + this.name + " hat " + this.hoehe + " meter Hoehe.";
    }

}
import java.lang.*;

public class Haus implements HatHoehe, Comparable<Haus> {
    String name;
    int hoehe;

    public Haus(String name, int hoehe) {
        this.name = name;
        this.hoehe = hoehe;
    }

    public int getHoehe() {
        return this.hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public boolean istHoeher(HatHoehe object) {
        if (this.hoehe > object.getHoehe()) {
            return true;
        }
        else {
            return false;
        }
    }

    public int compareTo(Haus haus) {
        return this.hoehe > haus.hoehe ? 1 : this.hoehe < haus.hoehe ? -1 : 0;
    }

    @Override
    public String toString() {
        return this.name + ", Höhe ist: " + this.hoehe + "m.";
    }
}
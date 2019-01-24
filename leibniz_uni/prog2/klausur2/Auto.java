package klausur2;

class Auto extends Fahrzeug implements Comparable<Auto> {
    int weight;

    public Auto(int weight) {
        this.weight = weight;
    }

    public int compareTo(Auto auto) {
        return this.weight > auto.weight ? 1 : this.weight < auto.weight ? -1 : 0;
    }

    @Override
    boolean istSchwerer(Fahrzeug auto) {
        return this.weight > auto.weight ? true : false;
    }

    @Override
    public String toString() {
        return "Gewicht: " + this.weight;
    }
}
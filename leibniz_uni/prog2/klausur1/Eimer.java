package klausur1;

class Eimer implements Comparable<Eimer> {
    int volume;

    public Eimer(int volume) {
        this.volume = volume;
    }

    public int compareTo(Eimer eimer) {
        return this.volume > eimer.volume ? 1 : this.volume < eimer.volume ? -1 : 0;
    }

    @Override
    public String toString() {
        return "Eimer hat eine Volume von: " + this.volume;
    }
}
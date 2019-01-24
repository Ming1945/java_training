package probeklausur;

class Building implements Comparable<Building> {
    String name;
    int height;

    public Building(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public int compareTo(Building building) {
        return this.height > building.height ? 1 : this.height < building.height ? -1 : 0;
    }
}
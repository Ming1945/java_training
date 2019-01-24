package probeklausur;

import java.util.*;
import sort.*;

class Main {
    public static void main(String[] args) {
        List<Building> buildingList = new ArrayList<Building>();

        buildingList.add(new Building("Abraj Al-Bait Clock Tower", 601));
        buildingList.add(new Building("Burj Khalifa", 828));
        buildingList.add(new Building("China Zun", 528));
        buildingList.add(new Building("Guangzhou CTF Finance Centre", 530));
        buildingList.add(new Building("International Commerce Centre", 484));
        buildingList.add(new Building("Jin Mao Tower", 421));
        buildingList.add(new Building("KK100", 442));
        buildingList.add(new Building("Marina 101", 425));
        buildingList.add(new Building("Lotte World Tower", 554));
        buildingList.add(new Building("One World Trade Center", 541));
        buildingList.add(new Building("Ping An Finance Centre", 599));
        buildingList.add(new Building("Shanghai Tower", 632));
        buildingList.add(new Building("Tianjin CTF Finance Centre", 530));
        buildingList.add(new Building("Willis Tower", 442));
        buildingList.add(new Building("Zifeng Tower", 450));

        Sort.quickSort(buildingList);
        for (Building building : buildingList) {
            System.out.println("Name: "+ building.name + "|| Height: " + building.height);
        }
    }
}
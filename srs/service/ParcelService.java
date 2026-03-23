package service;

import java.util.*;
import entity.Parcel;

public class ParcelService implements Manageable<Parcel> {
    private List<Parcel> parcels = new ArrayList<>();

    public void add(Parcel p) {
        parcels.add(p);
    }

    public void remove(int index) {
        parcels.remove(index);
    }

    public void showAll() {
        for (int i = 0; i < parcels.size(); i++) {
            System.out.println(i + ": " + parcels.get(i));
        }
    }

    public void markReceived(int index) {
        parcels.get(index).markReceived();
    }
}
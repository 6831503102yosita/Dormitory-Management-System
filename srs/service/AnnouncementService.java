package service;

import java.util.*;
import entity.Announcement;

public class AnnouncementService implements Manageable<Announcement> {
    private List<Announcement> list = new ArrayList<>();

    public void add(Announcement a) {
        list.add(a);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public void showAll() {
        for (Announcement a : list) {
            System.out.println(a);
        }
    }
}
package service;

import java.util.*;
import entity.RepairRequest;

public class RepairService implements Manageable<RepairRequest> {
    private List<RepairRequest> requests = new ArrayList<>();

    public void add(RepairRequest r) {
        requests.add(r);
    }

    public void remove(int index) {
        requests.remove(index);
    }

    public void showAll() {
        for (int i = 0; i < requests.size(); i++) {
            System.out.println(i + ": " + requests.get(i));
        }
    }

    public void updateStatus(int index, String status) {
        requests.get(index).updateStatus(status);
    }
}
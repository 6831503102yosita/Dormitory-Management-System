package entity;


public class Parcel {
    private String owner;
    private boolean received;

    public Parcel(String owner) {
        this.owner = owner;
        this.received = false;
    }

    public void markReceived() {
        this.received = true;
    }

    public String toString() {
        return owner + " | Received: " + received;
    }
}
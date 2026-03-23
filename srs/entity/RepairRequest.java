package entity;

public class RepairRequest {
    private String description;
    private String status;

    public RepairRequest(String description) {
        this.description = description;
        this.status = "Pending";
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return description + " | Status: " + status;
    }
}
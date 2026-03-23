import java.util.*;
import service.*;
import entity.*;
import util.InvalidInputException;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ParcelService parcelService = new ParcelService();
            RepairService repairService = new RepairService();
            AnnouncementService announcementService = new AnnouncementService();

            while (true) {
                System.out.println("\n=== Dormitory System ===");
                System.out.println("1. Add Parcel");
                System.out.println("2. View Parcels");
                System.out.println("3. Mark Parcel Received");
                System.out.println("4. Add Repair");
                System.out.println("5. View Repairs");
                System.out.println("6. Update Repair Status");
                System.out.println("7. Add Announcement");
                System.out.println("8. View Announcements");
                System.out.println("9. Exit");

                int choice = sc.nextInt();
                sc.nextLine();
                

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Owner: ");
                            parcelService.add(new Parcel(sc.nextLine()));
                            break;

                        case 2:
                            parcelService.showAll();
                            break;

                        case 3:
                            parcelService.showAll();
                            System.out.print("Index: ");
                            int i = sc.nextInt();
                            parcelService.markReceived(i);
                            break;

                        case 4:
                            System.out.print("Repair: ");
                            repairService.add(new RepairRequest(sc.nextLine()));
                            break;

                        case 5:
                            repairService.showAll();
                            break;

                        case 6:
                            repairService.showAll();
                            System.out.print("Index: ");
                            int r = sc.nextInt();
                            sc.nextLine();
                            System.out.print("New Status: ");
                            repairService.updateStatus(r, sc.nextLine());
                            break;

                        case 7:
                            System.out.print("Message: ");
                            announcementService.add(new Announcement(sc.nextLine()));
                            break;

                        case 8:
                            announcementService.showAll();
                            break;

                        case 9:
                            return;

                        default:
                            throw new InvalidInputException("Invalid menu");
                    }

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}

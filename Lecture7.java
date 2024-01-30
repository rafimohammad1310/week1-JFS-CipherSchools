import java.util.HashMap;
import java.util.Map;

interface OlaCustomers {
    void bookCab();
    void findARide();
    void rentCab();
    void rateDriver();
    void scheduleToWallet();
    void cancelCab();
    void addMoneyToWallet();
    void raiseTicket();
    void signup();
    void signIn();
}

interface OlaDriver {
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    void customerFeedback();
}

interface OlaOwner {
    void getDriveRecords();
    void getReportByDriverID();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomerFeedback();
    void addDriver(String driverName);
    void removeDriver(String driverName);
    void changeDriverStatus(String driverName, boolean newStatus);
}

public class Lecture7 implements OlaOwner, OlaDriver, OlaCustomers {
    private Map<String, Boolean> driversAvailability = new HashMap<>();

    public static void main(String[] args) {
        Lecture7 rafi = new Lecture7();
        rafi.addDriver("Rafi");
        rafi.addDriver("Mohm");

        OlaCustomers mohm = rafi;
        mohm.bookCab();
        mohm.addMoneyToWallet();

        OlaDriver md = rafi;
        md.callCustomer();
        md.getMyCommission();
    }

    @Override
    public void bookCab() {
        System.out.println("Cab booked successfully!");
    }

    @Override
    public void findARide() {
        System.out.println("Finding a ride...");
    }

    @Override
    public void rentCab() {
        System.out.println("Cab rented successfully!");
    }

    @Override
    public void rateDriver() {
        System.out.println("Driver rated!");
    }

    @Override
    public void scheduleToWallet() {
        System.out.println("Transaction scheduled to wallet.");
    }

    @Override
    public void cancelCab() {
        System.out.println("Cab canceled!");
    }

    @Override
    public void addMoneyToWallet() {
        System.out.println("Money added to wallet.");
    }

    @Override
    public void raiseTicket() {
        System.out.println("Ticket raised!");
    }

    @Override
    public void signup() {
        System.out.println("Signed up successfully!");
    }

    @Override
    public void signIn() {
        System.out.println("Signed in successfully!");
    }

    @Override
    public void acceptBooking() {
        System.out.println("Booking accepted!");
    }

    @Override
    public void getCustomerLocation() {
        System.out.println("Customer location retrieved.");
    }

    @Override
    public void setAvailableStatus() {
        System.out.println("Availability status set.");
    }

    @Override
    public void getMyCommission() {
        System.out.println("Commission retrieved.");
    }

    @Override
    public void raiseMoneyTransferRequest() {
        System.out.println("Money transfer request raised.");
    }

    @Override
    public void callCustomer() {
        System.out.println("Calling customer...");
    }

    @Override
    public void setUpYourVehicle() {
        System.out.println("Vehicle set up successfully.");
    }

    @Override
    public void customerFeedback() {
        System.out.println("Customer feedback received.");
    }

    @Override
    public void getDriveRecords() {
        System.out.println("Drive records retrieved.");
    }

    @Override
    public void getReportByDriverID() {
        System.out.println("Report by driver ID retrieved.");
    }

    @Override
    public void getReportByRegion() {
        System.out.println("Report by region retrieved.");
    }

    @Override
    public void getTotalRevenue() {
        System.out.println("Total revenue retrieved.");
    }

    @Override
    public void getCustomerFeedback() {
        System.out.println("Customer feedback retrieved.");
    }

    @Override
    public void addDriver(String driverName) {
        driversAvailability.put(driverName, true);
        System.out.println("Driver " + driverName + " added successfully.");
    }

    @Override
    public void removeDriver(String driverName) {
        driversAvailability.remove(driverName);
        System.out.println("Driver " + driverName + " removed successfully.");
    }

    @Override
    public void changeDriverStatus(String driverName, boolean newStatus) {
        driversAvailability.put(driverName, newStatus);
        System.out.println("Driver " + driverName + " status changed to " + (newStatus ? "Available" : "Not Available"));
    }
}

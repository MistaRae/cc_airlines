package Person.Staff;

public class Pilot extends Staff{

    private int licenceNo;

    public Pilot(String name, Rank rank, int licenceNo) {
        super(name, rank);
        this.licenceNo = licenceNo;
    }

    public int getPayFromStaff() {
        return getPayFromEnum();
    }

    public int getLicenceNo() {
        return this.licenceNo;
    }

    public String flyThePlane() {
        return "Autopilot engaged";
    }
}

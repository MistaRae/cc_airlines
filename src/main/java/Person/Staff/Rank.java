package Person.Staff;

public enum Rank {

    CAPTAIN(1000),
    FIRST_OFFICER(500),
    SECOND_OFFICER(350),
    PURSER(200),
    FLIGHT_ATTENDANT(100);

    private final int pay;

    Rank(int pay){
        this.pay = pay;
    }

    public int getPay() {
        return pay;
    }

}

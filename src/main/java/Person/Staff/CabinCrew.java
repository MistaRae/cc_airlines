package Person.Staff;

public class CabinCrew extends Staff {

    private Rank rank;

    public CabinCrew(String name, Rank rank) {
        super(name, rank);
    }

    public Rank getRankFromStaff(){
        return getRank();
    }

}


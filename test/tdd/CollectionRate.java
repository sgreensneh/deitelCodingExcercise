package tdd;

public class CollectionRate {
    private int bonus;
    public int setRate(int parcels) {
        this.bonus = bonus * parcels;
//        int bonus = this.bonus * parcels;
        if (parcels >= 50 && parcels <= 59) {
            bonus = 200 * parcels;
        }
        if (parcels >= 59 && parcels <= 69){
            bonus = 250 * parcels;
        }
        if (parcels >= 70){
            bonus = 500 * parcels;
        }

        return bonus;
    }
}

package chapterThree;

public class Driller {

    public int amount(int price, int copies) {
        if (copies > 0 && copies <=4){
            price = 2000 * copies;
        }
        if (copies > 4 && copies <= 9){
            price = 1800 * copies;
        }
        if (copies > 9 && copies <= 29){
            price = 1600 * copies;
        }
        if (copies > 29 && copies <= 49) {
            price = 1500 * copies;
        }
        if (copies > 49 && copies <= 99){
            price = 1300 * copies;
        }

        return price;
    }
}

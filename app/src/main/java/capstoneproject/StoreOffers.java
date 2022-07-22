package capstoneproject;

public class StoreOffers {

    public double checkDiscount(double total_cost){
        if(total_cost > 100)
            return (0.95 * total_cost);
        else
            return total_cost;
    }

    public int milkOffer(int litres){
        if(litres >= 2){
            for (int i = litres - 2; i >= 0; i = i-2) {
                litres ++;
            }
        }
        return  litres;
    }
}

/**
 * Created by Константин on 15.01.2017.
 */
public class PartiotionNumber {
    int number;
    int na, nb, nc, nd;

    public PartiotionNumber(int number) {
        this.number = number;
    }
    public void nnumbers(){
        this.na = number/1000;
        this.nb = number/100%10;
        this.nc = number/10%10;
        this.nd = number/1%10;
        BullsAndCows bac = new BullsAndCows(na, nb, nc, nd);
    }

}

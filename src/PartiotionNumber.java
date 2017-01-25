/**
 * Created by Dmitrii on 15.01.2017.
 */
public class PartiotionNumber implements Solver {
    int number;
    int na, nb, nc, nd;
    int random = (int) ((Math.random() * 9000) + 1000);
    int ra, rb, rc, rd;

    public PartiotionNumber(int number) {
        this.number = number;
    }
    public  BullsAndCows solve(){
        this.na = number/1000;
        this.nb = number/100%10;
        this.nc = number/10%10;
        this.nd = number/1%10;
        return new BullsAndCows(na, nb, nc, nd);
    }
    public BullsAndCows solve1() {
        this.na = number/1000;
        this.nb = number/100%10;
        this.nc = number/10%10;
        this.nd = number/1%10;
        this.ra = random/1000;
        this.rb = random/100%10;
        this.rc = random/10%10;
        this.rd = random/1%10;
        return new BullsAndCows(na, nb, nc, nd, ra, rb, rc, rd);

    }

}

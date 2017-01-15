/**
 * Created by Dmitrii on 06.01.2017.
 */
public class BullsAndCows {
    int na, nb, nc, nd;
    int ra, rb, rc, rd;

    public BullsAndCows(int na, int nb, int nc, int nd) {
        this.na = na;
        this.nb = nb;
        this.nc = nc;
        this.nd = nd;
    }

    public BullsAndCows(int ra) {
        this.ra = ra;
    }

    public BullsAndCows(int rb, int rc, int rd) {
        this.rb = rb;
        this.rc = rc;
        this.rd = rd;
        Unite u = new Unite(na, nb, nc, nd, ra, rb, rc, rd);
    }

}

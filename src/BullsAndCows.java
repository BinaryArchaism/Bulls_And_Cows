import java.util.Scanner;

/**
 * Created by Dmitrii on 06.01.2017.
 */
public class BullsAndCows {
    int na, nb, nc, nd;
    int ra, rb, rc, rd;
    int bulls = 0;
    int cows = 0;
    int status = 0;

    public BullsAndCows(int na, int nb, int nc, int nd, int ra, int rb, int rc, int rd) {
        this.na = na;
        this.nb = nb;
        this.nc = nc;
        this.nd = nd;
        this.ra = ra;
        this.rb = rb;
        this.rc = rc;
        this.rd = rd;
        setBulls();
    }

    public BullsAndCows(int na, int nb, int nc, int nd) {
        this.na = na;
        this.nb = nb;
        this.nc = nc;
        this.nd = nd;
    }

    public void setBulls(){
        do {
            Scanner sc = new Scanner(System.in);
            equalOfNumber(na, ra, rb, rc, rd);
            equalOfNumber(nb, ra, rb, rc, rd);
            equalOfNumber(nc, ra, rb, rc, rd);
            equalOfNumber(nd, ra, rb, rc, rd);
            if (bulls == 4) {break;}
            System.out.println(bulls+" "+cows);
            PartiotionNumber pn = new PartiotionNumber(sc.nextInt());
            pn.solve();
            bulls = 0;
            cows = 0;
        } while (status == 0);
    }

    public void equalOfNumber(int a, int b,int c,int d, int e){
        if (a == b) bulls++;
        if (a == c || a == d || a == e) cows++;
    }
}

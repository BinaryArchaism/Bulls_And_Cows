/**
 * Created by Dmitrii on 15.01.2017.
 */
public class PartiotionRandom {
    int random = (int) ((Math.random() * 9000) + 1000);
    int ra, rb, rc, rd;


    public void rnumbers(){
        this.ra = random/1000;
        this.rb = random/100%10;
        this.rc = random/10%10;
        this.rd = random/1%10;
        BullsAndCows bac = new BullsAndCows(rb, rc, rd);
        BullsAndCows bac1 = new BullsAndCows(ra);
    }
}

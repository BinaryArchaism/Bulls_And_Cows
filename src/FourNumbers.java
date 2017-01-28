/**
 * Created by Dmitrii on 28.01.2017.
 */
public class FourNumbers {
    int number;
    int a, b, c, d;

    public boolean CheckingNumber(int number){
        a = number/1000;
        b = number/100%10;
        c = number/10%10;
        d = number/1%10;
        if ((a == b | a == c | a == d) | (b == c | b == d) | (c == d)){
            System.out.println("Вы ввели неправильное число");return false;}
        else return true;
    }
    public int bullSolver(int ra, int rb, int rc, int rd){
        int bulls = 0;
        if (a == ra) bulls++;
        if (b == rb) bulls++;
        if (c == rc) bulls++;
        if (d == rd) bulls++;
        return bulls;
    }
    public int cowSolver(int ra, int rb, int rc, int rd){
        int cows = 0;
        if (a == ra) cows++;
        if (b == rb) cows++;
        if (c == rc) cows++;
        if (d == rd) cows++;
        return cows;
    }
}

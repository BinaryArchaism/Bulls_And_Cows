/**
 * Created by Dmitrii on 28.01.2017.
 */
public class FourNumbers {
    int number;
    int a, b, c, d;

    public boolean checkingNumber(int number){
        a = number/1000;
        b = number/100%10;
        c = number/10%10;
        d = number/1%10;
        if ((a == b | a == c | a == d) | (b == c | b == d) | (c == d)){
            System.out.println("Вы ввели неправильное число");return false;}
        else if (a == 0) {System.out.println("Вы ввели неправильное число");return false;}
        else return true;
    }
    public boolean checkingRandom(int a, int b, int c, int d){
        if ((a == b | a == c | a == d) | (b == c | b == d) | (c == d)){return false;}
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
        if (a == rb | a == rc | a == rd) cows++;
        if (b == ra | b == rc | b == rd) cows++;
        if (c == ra | c == rb | c == rd) cows++;
        if (d == ra | d == rb | d == rc) cows++;
        return cows;
    }
}

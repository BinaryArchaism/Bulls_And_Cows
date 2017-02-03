/**
 * Created by Dmitrii on 28.01.2017.
 */
public class FourNumbers {
    int a, b, c, d;

    public FourNumbers() {
    }

    public FourNumbers(int number) {
        a = number/1000;
        b = number/100%10;
        c = number/10%10;
        d = number/1%10;
    }

    public boolean checkingNumber(){
        if ((a == b | a == c | a == d) | (b == c | b == d) | (c == d)){
            System.out.println("Вы ввели неправильное число");return false;}
        else if (a == 0) {System.out.println("Вы ввели неправильное число");return false;}
        else return true;
    }

    public int bullSolver(FourNumbers fourNumbers){
        int bulls = 0;
        if (a == fourNumbers.getA()) bulls++;
        if (b == fourNumbers.getB()) bulls++;
        if (c == fourNumbers.getC()) bulls++;
        if (d == fourNumbers.getD()) bulls++;
        return bulls;
    }
    public int cowSolver(FourNumbers fourNumbers){
        int cows = 0;
        if (a == fourNumbers.getB() | a == fourNumbers.getC() | a == fourNumbers.getD()) cows++;
        if (b == fourNumbers.getA() | b == fourNumbers.getC() | b == fourNumbers.getD()) cows++;
        if (c == fourNumbers.getA() | c == fourNumbers.getB() | c == fourNumbers.getD()) cows++;
        if (d == fourNumbers.getA() | d == fourNumbers.getB() | d == fourNumbers.getC()) cows++;
        return cows;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }
}

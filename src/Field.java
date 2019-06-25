/**
 * Created by Dmitrii on 28.01.2017.
 */
public class Field {
    public void start(){
        Player player = new Player();
        Computer computer = new Computer();

        do {
            player.getNumber();

            int bulls = computer.getFourNumbers().bullSolver(player.fourNumbers);
            int cows = computer.getFourNumbers().cowSolver(player.fourNumbers);
            System.out.println("Bulls: " + bulls + " Cows: " + cows);

            if (bulls == 4) {System.out.println("You win!");return;}
            else System.out.println("Input number again, please");
        } while (true);
    }
}

package Oracle.course;

public class Exercise1 {
    public static void main(String[] args) {
        int [] player1= new int[]{10,6,8,9,7,12,7};
        int [] player2= new int[]{7,6,9,5,2,8,11};
        int player1Wins=0;
        int player2Wins=0;

        for (int i=0; i< player1.length; i++) {
            System.out.print("Round number: " + (i+1) + "- ");
            if(player1[i]>player2[i]) {
                player1Wins++;
                System.out.print("Player 1 wins the round: "+ player1[i] +" beats " + player2[i]);
            } else if (player1[i]<player2[i]) {
                player2Wins++;
                System.out.print("Player 2 wins the round: "+ player2[i] +" beats " + player1[i]);
            } else {
                System.out.print("Tie! "+ player1[i] +" ties with " + player2[i]);
            }
            System.out.println("");
        }

        if (player1Wins>player2Wins) {
            System.out.println("Player One wins!! They won " + player1Wins + " rounds beating PLayer two who won "+ player2Wins+" rounds");
        } else if (player2Wins>player1Wins) {
            System.out.println("Player Two wins!! They won " + player2Wins + " rounds beating PLayer One who won "+ player1Wins+" rounds");
        } else {
            System.out.println("It was a TIE!!");
        }
        System.out.println("Goodbye");
    }
}

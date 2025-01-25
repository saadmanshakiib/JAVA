import java.util.Random;

public class prediction {
    public static void main(String[] args) {
        int barcelona_score, madrid_score;
        Random r = new Random();
        barcelona_score = r.nextInt(2 );
        madrid_score = r.nextInt(5);
        System.out.println("Barcelona "+barcelona_score +" "+madrid_score+" Real Madrid");
    }
}

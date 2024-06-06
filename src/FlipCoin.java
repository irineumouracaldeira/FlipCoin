import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {
        int numExperiments = 10;
        
        Random random = new Random();
        
        for (int i = 0; i < numExperiments; i++) {
            double chance = random.nextDouble();
            
            if (chance < 0.5) {
                System.out.println("Resultado: Superior");
            } else {
                System.out.println("Resultado: Inferior");
            }
        }

        
        }
    }


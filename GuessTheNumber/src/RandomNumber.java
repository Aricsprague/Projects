import java.lang.Math;
public class RandomNumber {
    int min = 1;
    int max = 20;
    int genNumber = (int)(Math.random()*(max-min+1)+min);
}


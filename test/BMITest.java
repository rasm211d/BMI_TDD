import junit.framework.TestCase;

public class BMITest extends TestCase {
    public void testBMIBeregning() {
        double resultat;
        resultat = BMI.bmiBeregner(1.85, 95);
        assertEquals(27.8,resultat);
    }

}
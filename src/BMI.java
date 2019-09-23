public class BMI {

    static double bmiBeregner(double højde, double vaegt){
        //resultat med mange decimaler
        double resultat = vaegt / Math.pow(højde, 2);
        //resultat med to decimaler
        resultat = Math.round(resultat*10.0)/10.0;
        return resultat;


    }

}

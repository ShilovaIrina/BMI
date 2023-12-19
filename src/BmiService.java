public class BmiService {
    public int calculate(int kg, double m) {
        int result;
        result = (int) (kg / (m * m));

        return result;
    }

}

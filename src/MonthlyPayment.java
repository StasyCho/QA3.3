public class MonthlyPayment {
    public float calculate(float credit, float month, float percent) {
        float monthPercent = percent / 12 / 100;
        float result = (float) ((float) (credit * monthPercent * Math.pow((1 + monthPercent), month)) /
                (Math.pow((1 + monthPercent), month) - 1));
        return result;
    }
}



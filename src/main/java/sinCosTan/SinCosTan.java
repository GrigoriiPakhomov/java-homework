package main.java.sinCosTan;

public class SinCosTan {
    private final double radians;
    private final double sin;
    private final double cos;
    private final double tan;



    public SinCosTan(double angle) {
        this.radians = angle * Math.PI / 180;
        this.sin = Math.sin(radians);
        this.cos = Math.cos(radians);

        if (Math.abs(this.cos) < 0.0000000001) {
            throw new IllegalArgumentException("Тангенс не определен");
        }
        this.tan = Math.tan(this.radians);
    }

    public double getSin() {
        return sin;
    }

    public double getCos() {
        return cos;
    }

    public double getTan() {
        return tan;
    }
}
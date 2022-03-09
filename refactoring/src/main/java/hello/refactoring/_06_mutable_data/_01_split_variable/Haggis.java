package hello.refactoring._06_mutable_data._01_split_variable;

public class Haggis {

    private double primaryForce;
    private double secondaryForce;
    private double mass;
    private int delay;

    public Haggis(double primaryForce, double secondaryForce, double mass, int delay) {
        this.primaryForce = primaryForce;
        this.secondaryForce = secondaryForce;
        this.mass = mass;
        this.delay = delay;
    }

    public double distanceTravelled(int time) {
        double result;
        final double primayAccleration = primaryForce / mass;
        int primaryTime = Math.min(time, delay);
        result = 0.5 * primayAccleration * primaryTime * primaryTime;

        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            final double primaryVelocity = primayAccleration * delay;
            final double secondaryAccleration = (primaryForce + secondaryForce) / mass;
            result += primaryVelocity * secondaryTime + 0.5 * secondaryAccleration * secondaryTime + secondaryTime;
        }

        return result;
    }
}

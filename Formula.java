package DimaHelp;

public class Formula {
    float x;
    float y;
    float z;
    float alpha;


    void set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void run() {
        final float FIRST = (float) Math.log(Math.pow(y, -(Math.sqrt(Math.abs(x))))) * (x - y / 2);
        final float SECOND = (float) Math.pow(Math.sin(Math.atan(z)), 2);

        alpha = FIRST + SECOND;
    }

    void print() {
        String result = String.format("%.3f", alpha);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Formula formula = new Formula();
        formula.set(-15.246f, (float) (4.642 * Math.pow(10, -2)), (float) (20.001 * Math.pow(10, 2)));
        formula.run();
        formula.print();
    }
}

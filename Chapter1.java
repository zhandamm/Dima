package DimaHelp;

public class Chapter1 {
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;
    double result = (int) ((f * b) + (i / c) - (d * s));

    float FloatOperation = 1f / 0f;
    double DoubleOperation = 1d / 0d;


    public static void main(String[] args) {
        Chapter1 obj = new Chapter1();
        System.out.println(obj.result);
        System.out.println(obj.FloatOperation);
        System.out.println(obj.DoubleOperation);


    }
}

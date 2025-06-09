public interface Calculator {
    public int plus(int a, int b);
    public int minus(int a, int b);
    public int multiply(int a, int b);
    public int divide(int a, int b);

    default int exec(int a, int b){
        return a+b;
    };

    public static int exec2(int a, int b){
        return a*b;
    };
}

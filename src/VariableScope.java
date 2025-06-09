public class VariableScope {
    int globalScope = 10;
    static int staticValue =  7;

//    public void scopeTest(int value){
//        int localScope = 20;
//
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
//    }
//
//    public void scopeTest2(int value2){
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
//        System.out.println(value2);
//    }

    static public void main(String[] args) {
        System.out.println(staticValue);
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);

        VariableScope v1 = new VariableScope();
        System.out.println(v1.globalScope);
        VariableScope v2 = new VariableScope();
        v1.globalScope = 100;
        v2.globalScope = 200;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v1.staticValue = 500;
        v2.staticValue = 1000;
        System.out.println(v1.staticValue);
        System.out.println(v2.staticValue);
        System.out.println(VariableScope.staticValue);
    }
}

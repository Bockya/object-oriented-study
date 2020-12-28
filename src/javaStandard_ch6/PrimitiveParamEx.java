package javaStandard_ch6;

class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        change();
        System.out.println("After change(d.x)");
        System.out.println("main(): x = " + d.x);
    }

    private static void change() {
        int x = 1000;
        System.out.println("change(): x = " + x);
    }
}

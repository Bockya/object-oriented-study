class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    private static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp; //복사한 객체의 주소 반환
    }
}

class CarTest3 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2(c1); //c1의 복사본 c2 생성

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);

        c1.door = 100; //c1의 인스턴스 변수 door 값 변경
        System.out.println("c1.door = 100; 수행 후");
        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}

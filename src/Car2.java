class Car2 {
    String color; //색상
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door; //문의 개수

    Car2() {
        this("white", "auto", 4);
    }

    Car2(Car2 c) { //인스턴스 복사를 위한 생성자
        this(c.color, c.gearType, c.door);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

package extends1.ex;

public class Album extends Item {
    // 필드
    private String artist;

    // 생성자
    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    // 메서드
    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트: " + artist);
    }
}

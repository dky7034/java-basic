package extends1.ex;

public class Movie extends Item {
    // 필드
    private String director;
    private String actor;

    // 생성자
    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    // 메서드
    @Override
    public void print() {
        super.print();
        System.out.println("- 감독: " + director + ", 배우: " + actor);
    }
}

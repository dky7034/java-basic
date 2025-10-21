package extends1.ex;

public class Book extends Item {
    // 필드
    private String author;
    private String isbn;

    // 생성자
    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    // 메서드
    @Override
    public void print() {
        super.print();
        System.out.println("- 저자: " + author + ", isbn: " + isbn);
    }
}

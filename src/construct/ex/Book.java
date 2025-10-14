package construct.ex;

public class Book {
    // 필드
    String title; //제목
    String author; //저자
    int page; //페이지 수

    // TODO: 코드 완성, 중복 없이
    // 생성자
    // 기본 생성자
    public Book() {
        this("", "", 0);
    }

    // 생성자 오버로딩1
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // 생성자 오버로딩2
    public Book(String title, String author) {
        this(title, author, 0);
    }

    // 메서드
    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지 수: " + page);
    }
}

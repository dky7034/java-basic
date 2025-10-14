package construct;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    // 생성자 추가
    MemberConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
    }

    // 생성자
    MemberConstructor(String name, int age, int grade) {
        System.out.println("생성자 호출: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

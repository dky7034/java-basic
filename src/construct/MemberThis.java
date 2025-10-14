package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // this는 멤버변수랑 지역변수의 구분이 어렵다는 점을 극복하기 위해 사용하게 되었음
        // 이 경우는 this 생략 가능
        // this는 무조건 멤버 변수를 가리키는 것 (정확히 말하면, this는 인스턴스의 참조값을 의미)
        // 최근에는 IDE의 발달로 this를 잘 사용하지 않는 추세 (IDE가 필드명을 색깔로 구분해줌)
        nameField = nameParameter;
    }
}

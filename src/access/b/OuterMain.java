package access.b;

import access.a.AccessData;

public class OuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        // public 호출 가능
        accessData.publicField = 1;
        accessData.publicMethod();

        // 다른 패키지 default 호출 불가능
//        accessData.defaultField = 2;
//        accessData.defaultMethod();

        // private 호출 불가
//        accessData.privateField = 3;
//        accessData.privateMethod();

        accessData.innerAccess();
    }
}

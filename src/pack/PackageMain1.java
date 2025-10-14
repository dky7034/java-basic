package pack;

import pack.a.User;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지에 있는 경우 패키지 경로 생략 가능
        User user = new User(); // 다른 패키지에 있으므로 패키지 경로 필요
    }
}

package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstructor memberConstructor = new MemberConstructor("user1", 15, 90);
        MemberConstructor memberConstructor2 = new MemberConstructor("user2", 16, 80);

        MemberConstructor[] members = {memberConstructor, memberConstructor2};

        for (MemberConstructor member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }

    }
}

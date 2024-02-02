package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        initMember(memberInit1,"user1", 15, 6);

        MemberInit memberInit2 = new MemberInit();
        initMember(memberInit2,"user2", 20, 16);

        MemberInit[] members = {memberInit1, memberInit2};

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);
        }
    }

    static void initMember(MemberInit memberInit1, String name, int age, int grade) {
        memberInit1.name = name;
        memberInit1.age = age;
        memberInit1.grade = grade;
    }
}

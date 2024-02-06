package poly.basic;

public class CastingMain {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();

        call(parent1);
        System.out.println("_________________________________");
        call(parent2);
    }


    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
        } else {
            System.out.println("인스턴스 아님");
        }
    }

}

package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;

        System.out.println("메서드 호출전 data:" + data.value);
        changePrimitive(data);
        System.out.println("메서드 호출후 data:" + data.value);
    }

    static void changePrimitive(Data x) {
        x.value = 20;
    }

}

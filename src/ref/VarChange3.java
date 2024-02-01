package ref;

public class VarChange3 {

    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA:" + dataA);
        System.out.println("dataB:" + dataB);
        System.out.println("dataA.Value:" + dataA.value);
        System.out.println("dataB.Value:" + dataB.value);

        dataA.value = 20;
        System.out.println("dataA.Value:" + dataA.value);
        System.out.println("dataB.Value:" + dataB.value);

        dataB.value = 30;
        System.out.println("dataA.Value:" + dataA.value);
        System.out.println("dataB.Value:" + dataB.value);

    }

}

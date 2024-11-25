package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        // dataA의 참조값만 복사해서 dataB에 들어감!
        // dataB = x001;
        Data dataB = dataA;

        // 참조값은 같은 곳을 가리킴!
        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

    }
}

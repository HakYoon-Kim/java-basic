package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        // NullPointerException
        // x001.data에는 null이 들어있음. null에다가 .찍으니 널포인터..
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}

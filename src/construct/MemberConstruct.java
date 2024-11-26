package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자의 이름은 클래스 이름과 같아야 한다
    // 생성자는 반환 타입이 없다
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    };
}

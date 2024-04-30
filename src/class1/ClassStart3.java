package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        // 클래스는 설계도
        // 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 함
        // 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다(사용자 정의 타입)

        Student student1;         // Student 타입의 변수 선언
        student1 = new Student(); // Student 객체 생성, 반환되는 참조값(b4c966a) 을 변수에 저장
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); // b4c966a
        System.out.println(student2); // 2f4d3709

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}

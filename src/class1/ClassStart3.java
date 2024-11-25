package class1;

// 클래스 : 설계도
// 객체 or 인스턴스 : 클래스를 기반으로 실제 메모리에 만들어진 실체
// new ...
public class ClassStart3 {
    public static void main(String[] args) {
        // student 타입을 받을 수 있는 변수 선언
        Student student1;
        // new... 객체를 메모리에 생성
        // student1 = x001;
        student1 = new Student();
        // x001.name
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        // student2 = x002;
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

//        System.out.println(student1);
//        System.out.println(student2);

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

    }
}

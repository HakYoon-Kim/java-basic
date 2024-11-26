package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        // 이런 경우는 앞에 this 생략
        // 멤버 변수에 접근하는 경우에 항상 this를 넣는 코딩 스타일도 있음, 권장X
        nameField = nameParameter;
    }
}

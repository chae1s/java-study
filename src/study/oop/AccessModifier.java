package study.oop;

import study.oop.model.MemberVO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberVO memberVO = new MemberVO();
        memberVO.name = "춘배";
        memberVO.phone = "010-0000-0000";
//      memberVO.age = 10;         private -> 정보 은닉

        System.out.println(memberVO.name + "\t" + memberVO.phone);

        memberVO.play();
        // play 메소드가 private일 경우
        // java: play() has private access in study.oop.model.MemberVO 이러한 오류 메세지 발생
    }
}

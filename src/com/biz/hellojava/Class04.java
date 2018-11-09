package com.biz.hellojava;
// 코드를 작성할 때
// 단어와 단어들을 나열하여 문장을 만들고
// 문장들이 어울려서 어떤 기능(결과)를 만들어낸다
public class Class04 {

	// 만약 단어와 단어사이를 띄어쓰기를 한칸 이상
	// 하지 않거나 
	// _를 넣거나 숫자를 넣으면
	// 그것은 정상적인 문법이 아니기 때문에
	// 오류를 표시한다
	// void main : 정상적인 문법
	// void_main : 오류 >> void_main이라는 한 단어로 인식
	// void2main : 오류 >>void2main이라는 단어로 인식
	// static 2void : 2void는 아예 단어가 아니라고 인식
	// _test : 일단 의미는 모르지만 단어로 생각
		
	public static void main(String[] args) {
		// comment 주석 참고사항
		
		/*
		 * 특별히 빈칸으로 구분되지 않는 문장은
		 * 단어와 단어사이에 마침표(.)를 포함해서
		 * 단어와 단어를 구별한다.
		 * 
		 * Ctrl + D : 한줄 지우기(커서 있는 곳)
		 * Ctrl + Z : undo
		 * Ctrl + S : 저장
		 */
		
		System.out.println(30 *               40); // 숫자 30 40 곱해서 결과 보여주기
		System.out.println(); // 아무것도 보여주지 않기, 단 줄바꿈하기
		System.out.println("Hello");
		// ""로 묶이면 무엇이든 모두 string
		// 문자열은 보이는 그대로 출력
		System.out.println("30+40");
		System.out.println("republic" + "of" + "korea"); // 문자열 덧셈(연산)하면 문자열 서로 순서대로 연결하여 1개의 문자열로 만듦
		System.out.println("republic "+"of "+"korea");
		// 문자열 사이는 +만
		System.out.println("30+40 = " + (30+40)); // 괄호 안부터 덧셈 후 문자열에 연결
		System.out.println("30+40=" + 30 + 40); // "30+40=" + "30" + "40"으로 인식 / "30+40=30" + "40"
	}

}

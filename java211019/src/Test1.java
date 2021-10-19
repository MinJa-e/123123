/* public (x) */class a{ //other class
	public class B{ // inner class
		// 메서드처럼 컴파일러가 인식하기 때문에 public을 사용가능
		
	}
}

public class Test1 {

	public static void main(String[] args) {
		// 중첩클래스 : 클래스 안에 또 다른 클래스가 있는 상태
		// * 중첩 클래스는 멤버(변수,메서드)의 형태로 클래스를 포함한다.
		// * 중첩 클래스의 개수제한은 없음.
		//	-> 독립적으로 수행하는 경우 필요x, 기능이나 동작이 클래스 형태로 표현되어야 할 때 사용
		// * GUI환경 개발 시 많이 사용(화면+이벤트/안드로이드) -> 람다식
		// * 데이터 은닉화를 통한 복잡도 감소, 코드 가독성 증가
		
		// * 하나의 파일 안에는 public 클래스는 하나만 존재한다. (Top level 클래스 - main() 포함)
		//	 -> 컴파일러가 실행 시에 main()메서드 구분
		//		중첩 클래스는 public 접근지정자 사용 가능
		
		// Inner Class
		// 1) Inner클래스는 Outer 클래스의 멤버를 마치 자신의 멤버처럼 사용가능하다.
		//		-> Outer클래스의 멤버 중 private 접근지정자를 사용하는 멤버를 사용가능하다.
		// 2) Inner클래스 안에는 static변수를 사용 할 수 없다.
		//		-> static Inner 클래스는 생성 가능
		// 3) Inner클래스는 반드시 Outer클래스를 통해서 접근해야 함.
		// 4) 소스파일을 컴파일하면 Outer$Inner.class 이름으로 생성됨
	}

}

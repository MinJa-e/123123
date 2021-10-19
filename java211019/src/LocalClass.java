class OuterLocal{
	int a = 10;
	private int b = 20;
	static int c = 30;
}

public class LocalClass {

	public static void main(String[] args) {
		// LocalClass : Outer클래스 안에서 특정 클래스가 메서드 안에 정의되어 있는 클래스
		// -> 메서드 안에 생성되어 있기 때문에 지역변수처럼 인식
		//	 (메서드 호출 시 생성, 메서드 종료 시 소멸)
		// * 지역변수 사용 x ( 참조가능 - 1.7이후 컴파일러 자동처리 )
	}

}

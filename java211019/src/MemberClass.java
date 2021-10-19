class OuterMember{
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class InnerMember{
		public void prn(){
			System.out.println("int a : "+a);
			System.out.println("private int b : "+b);
			System.out.println("static int c : "+c);
		}
	}
	
}

public class MemberClass {

	public static void main(String[] args) {
	// MemberClass : Outer클래스의 멤버 변수/메서드처럼 클래스가 정의되서 사용되는 경우
	//				 Inner클래스를 사용하기 위해서는 반드시 Outer클래스를 생성해야 함.
	
	/*
	class out{
		class in{
			
		}
	}
	
	out o = new out();
	out.in i = o.new in();
	*/
	
	OuterMember om = new OuterMember();
	OuterMember.InnerMember im = om.new InnerMember();
	
	im.prn();
	
	}
}

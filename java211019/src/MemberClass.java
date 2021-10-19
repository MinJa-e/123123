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
	// MemberClass : OuterŬ������ ��� ����/�޼���ó�� Ŭ������ ���ǵǼ� ���Ǵ� ���
	//				 InnerŬ������ ����ϱ� ���ؼ��� �ݵ�� OuterŬ������ �����ؾ� ��.
	
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

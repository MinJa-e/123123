/* public (x) */class a{ //other class
	public class B{ // inner class
		// �޼���ó�� �����Ϸ��� �ν��ϱ� ������ public�� ��밡��
		
	}
}

public class Test1 {

	public static void main(String[] args) {
		// ��øŬ���� : Ŭ���� �ȿ� �� �ٸ� Ŭ������ �ִ� ����
		// * ��ø Ŭ������ ���(����,�޼���)�� ���·� Ŭ������ �����Ѵ�.
		// * ��ø Ŭ������ ���������� ����.
		//	-> ���������� �����ϴ� ��� �ʿ�x, ����̳� ������ Ŭ���� ���·� ǥ���Ǿ�� �� �� ���
		// * GUIȯ�� ���� �� ���� ���(ȭ��+�̺�Ʈ/�ȵ���̵�) -> ���ٽ�
		// * ������ ����ȭ�� ���� ���⵵ ����, �ڵ� ������ ����
		
		// * �ϳ��� ���� �ȿ��� public Ŭ������ �ϳ��� �����Ѵ�. (Top level Ŭ���� - main() ����)
		//	 -> �����Ϸ��� ���� �ÿ� main()�޼��� ����
		//		��ø Ŭ������ public ���������� ��� ����
		
		// Inner Class
		// 1) InnerŬ������ Outer Ŭ������ ����� ��ġ �ڽ��� ���ó�� ��밡���ϴ�.
		//		-> OuterŬ������ ��� �� private ���������ڸ� ����ϴ� ����� ��밡���ϴ�.
		// 2) InnerŬ���� �ȿ��� static������ ��� �� �� ����.
		//		-> static Inner Ŭ������ ���� ����
		// 3) InnerŬ������ �ݵ�� OuterŬ������ ���ؼ� �����ؾ� ��.
		// 4) �ҽ������� �������ϸ� Outer$Inner.class �̸����� ������
	}

}
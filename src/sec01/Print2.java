package sec01;

public class Print2 {

	public static void main(String[] args) {
		// 4x + 5y = 60�� ��� �ظ� ���ؼ� (x, y) ���·� ����Ͻÿ�.
		
		for(int a=1; a<=10; a++)
			for(int b=1; b<=10; b++)
				if((4*a+5*b)==60) {
					System.out.println( a + "," + b );
				}
		 
		
	}

}

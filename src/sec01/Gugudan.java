package sec01;
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// ����ڰ� �Է��� ���κ��� 9�ܱ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner gugudan = new Scanner(System.in);
		System.out.print("���Ͻô� ���ڸ� �Է��ϼ���: ");
			int a = gugudan.nextInt();
			if ((a==0)||(a>9))
			{
			System.out.println("�ٽ� �Է��ϼ���.");
			}
		
			else if (!(a==0)||a<=9) 
				for(int b=1; b<=9; b++)
				 {
					System.out.println( a + " X " + b + " = " + (a*b));
				 }
				
				}
				
				}



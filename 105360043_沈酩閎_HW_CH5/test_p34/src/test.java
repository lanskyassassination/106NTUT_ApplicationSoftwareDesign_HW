import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	public static void main(String[] args)
	{
		System.out.println("�п�J�r��");
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println("�w��J�r��" + str);
		}
		
		catch(IOException e)
		{
			System.out.println("��J�r�꦳�~");
		}
	}
}
import java.util.Scanner;

/********************
File Name    : Test.java
Author       : dy2488
Mail         : 1439433776@qq.com
Created Time : 2021年05月23日 星期日 13时51分40秒
********************/
public class Test
{
	public static int inmul(Integer x,Integer y)
	{
		return x*y;
	}
	public static Double doumul(Double x,Double y)
	{
		return x*y;
	}


	public static int compa(Integer x,Double y)
	{
		Double z=Double.parseDouble(x.toString());
		return y.compareTo(z);
	}

	public static void main(String[] args)
	{
		Scanner scan1=new Scanner(System.in);
		System.out.println("请输入第一个Integer数字");
		Integer x1=scan1.nextInt();
		System.out.println("请输入第一个Integer数字");
		Integer x2=scan1.nextInt();
		System.out.println("请输入第一个Double数字");
		Double y1=scan1.nextDouble();
		System.out.println("请输入第一个Double数字");
		Double y2=scan1.nextDouble();
		scan1.close();

		Integer x=inmul(x1,x2);
		Double y=doumul(y1,y2);

		if(compa(x, y)==0)
		{
			System.out.println("No Win or loss!!!");
		}
		else if(compa(x, y)==1)
		{
			System.out.println("Double Win!!!");
		}
		else
		{
			System.out.println("Integer Win!!!");
		}
		
	}

}



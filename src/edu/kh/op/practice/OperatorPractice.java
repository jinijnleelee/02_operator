package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice {

	
	public void practice1(){
		
		Scanner sc = new Scanner(System.in);
		
		int temp1 = sc.nextInt();
		System.out.print("인원 수 : " + temp1 );
		int temp2 = sc.nextInt();
		System.out.printf("사탕 갯수 : %d\n\n",temp2 );

		int put1 = temp2/temp1;
		System.out.println("1인당 사탕 갯수 : " + put1);
		int put2 = temp2%temp1;
		System.out.println("남는 사탕 갯수 : " + put2);
	
		
				
		
		
	}
	
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.print("이름 : " + name );
		int age = sc.nextInt();
		System.out.print("학년(정수만) : " + age );
		int cla = sc.nextInt();
		System.out.print("반(정수만) : " + cla );
		int num = sc.nextInt();
		System.out.print("번호(정수만) : " + num );
		String str = sc.next();
		System.out.print("성별(남학생/여학생) : " + str );
		float score = sc.nextFloat();
		System.out.printf("성적(소수점 아래 둘째 자리까지) : " + "%.2f\n",score);

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",age,cla,
				 num,name,str,score);
		
		
		
	}
	
	
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		System.out.print("국어 : " + kor );
		int eng = sc.nextInt();
		System.out.print("영어 : " + eng );
		int mat = sc.nextInt();
		System.out.print("수학 : " + mat );
		System.out.println();
		System.out.println();
		int sum = kor + eng + mat;
		System.out.printf("합계 : %d\n",sum );
	//	System.out.print("합계 : " + sum );
	//	System.out.println();
		float ave = (float)(sum /3.0);
		System.out.print("평균 : " + ave );
		
		
		
		
		
		
		
	}
}

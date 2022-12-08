package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice {

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	public void practice1(){
		
		Scanner sc = new Scanner(System.in);
		//스캐너 가져옴
		
		System.out.print("인원 수 : " );
		int temp1 = sc.nextInt();
		//정수값을 사용자에게 받아와서 정수형 temp1에 담아옴

		System.out.print("사탕 갯수 : " );
		int temp2 = sc.nextInt();
		
		
//		int temp2 = sc.nextInt();
//		System.out.printf("사탕 갯수 : %d\n\n",temp2 );
// 
		
		int put1 = temp2/temp1;
		System.out.println("1인당 사탕 갯수 : " + put1);
		
//굳이 변수를 안만들고 바로 실행했어도 되는데 ㅠ 흑흑 바보냐고 ㅠ 
//		System.out.println("1인당 사탕 갯수 : " + temp2/temp1);
		int put2 = temp2%temp1;
		System.out.println("남는 사탕 갯수 : " + put2);

// 		System.out.println("1인당 사탕 갯수 : " + temp2%temp1);
				
		
		
	}
// 다 틀렸네....................흑흑흑흐그흑흑	
	public void practice2(){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름 : ");
		String name = sc.next();
		//원래 print는 개행이 안되는데
		//sc같이 값을 받아온 경우에는 한 실행문이끝나서 다음줄로 넘어감
		
		System.out.print("학년(정수만) : ");
		int cla = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int num = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int age = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String nam = sc.next();
		
		
		
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		//float으로 했었는데 흑흑흑 왜 아니지?
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.",cla,
				 num,age,name,nam,score);
		
		
		
	}
	
	
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		System.out.printf("합계 : %d\n",sum );
	//	System.out.print("합계 : " + sum );
	//	System.out.println();
		double ave = sum /3.0;
		//	float ave = sum /3.0; 안되는 이유가 값이 더블이여서였다..
		System.out.printf("평균 : %.1f", ave );
		
		//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일때
		//합격 아니면 불합격
		boolean resurt= (kor>=40) &&(eng>=40) &&(mat>=40)&&(ave>=60);
		System.out.print(resurt ? "합격" : "불합격" );
		
		

// 왜이렇게 어렵게 생각을.........		
//		String srt1 = "합격";
//		String srt2 = "불합격";
//		String  sec  =sum/3.0==3 &&(60<=(int)ave)? srt1:srt2;
//		System.out.print(sec );
//		
//		
		
		
		
		
		
	}
}

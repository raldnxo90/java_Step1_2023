package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num;
		int score[]=null;
		int size=0;
		
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			
			System.out.print("선택 > ");
			num = scan.nextInt();
			score=new int[size];
			
			switch (num) {
			case 1: 
				System.out.print("학생수 > ");
				size =Integer.parseInt(scan.nextLine());
				
				break;
				
			case 2: 	
				for(int i=0;i<size;i++) {
					System.out.print("점수입력 > ");
					score[i]=Integer.parseInt(scan.nextLine());
					}
				break;
				
			case 3:
				for(int i=0;i<score.length;i++) {
					System.out.println(score[i]);
					
				}
				

			default:
				break;
			}
			
			
			
			
			/*
			if(num==1) {
				System.out.print("학생수 > ");
				size = scan.nextInt();
			}//if 1번
			
			else if(num==2) {
				for(int i=0;i<size;i++) {
				System.out.print("점수입력 > ");
				score[i]=scan.nextInt();
				}//for문
			
			}//if 2번
			else if(num==3) {
				for(int i=0;i<score.length;i++) {
					System.out.println(score[i]);
					
				}//for문
				
			}//if 3번
		
			*/
			
			
			
			
			
			
			
			
			/*
			System.out.print("선택 > ");
			num = scan.nextInt();
			
			switch (num) {
			case 1: 
				System.out.print("학생 수 > ");
				size = scan.nextInt();
				stu = new int[size];
				
			case 2:
				
				for(int i=0;i<size;i++);{
				j=0;
				System.out.print("점수입력 > ");
				score=scan.nextInt();
				stu[j]=score;
				++j;
				}
				break;
				
			default:
				break;
			}
			*/
			/*
			if (num == 1) {
				System.out.print("학생 수 > ");
				size = scan.nextInt();
				stu = new int[size];

				

			} // if 1번 선택
			
			if (num == 2) {
				
				
				for(int i=0;i<size;i++);{
				System.out.print("점수입력 > ");
				score=scan.nextInt();
				stu[i]=score;
				
				
				}//for문
			}//if 2번 선택
*/
		} // while문
		
		
	}// 메인
}// 클래스

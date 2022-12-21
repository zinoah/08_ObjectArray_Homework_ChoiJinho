package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;


public class ProductController {
	private Product[] pro = null;
	
	{
		pro = new Product[10];
	}
	
	
	public static int count ;
	
	Scanner sc = new Scanner(System.in);
	
	
	
	public void mainMenu() {
		//do~while 문을 이용하여 반복적으로 메뉴화면 출력 각 버튼 선택 시 각각의 메소드 호출
		
		int input = 0;
		
		//메뉴 출력
		do {
			System.out.println("===== 제품 관리 메뉴 =====\n");
			
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("입력 >>>> ");
			input = sc.nextInt(); 
			
			switch(input) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 0: System.out.println("\n프로그램을 종료합니다..."); break;
			default : System.out.println("잘못 입력 하셨습니다.");
			}
			
			
		}while(input != 0);
		
		
	}
	
	public void productInput() {
		//새로운 제품 정보 기록을 위해 보드로 정보들을 입력 받아객체를 생성하고 현재 카운트 인덱스에 주소 저장
		
		
		
		System.out.println("===== 도서 정보 추가=====\n");
		System.out.print("제품 번호 : ");
		int pld = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제품명 : ");
		String pName = sc.next();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		
		Product book = new Product(pld, pName, price, tax);
		
		pro[count] = book;
	
		System.out.println("기록된 도서 개수 : " + count);
	}
	
	
	public void productPrint() {
		//현재까지 기록된 도서 정보 모두 출력
		
		System.out.println("===== 도서 정보 =====");
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] != null )
				
			System.out.println(pro[i].information());
		}
		
	}
	
}

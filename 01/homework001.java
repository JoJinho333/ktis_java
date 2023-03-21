package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class homework001 {
    //프로그램 시작
    //1. 이름 등록

    //컬렉션 객체(이름을 등록하는)

    //배열 : 데이터의 집합 - 같은 타입의, 순서가 있다

    //String name = new String() //단수형
    String [] nameArray = new String [100]; //배열을 만들 때, 메모리 한정

    ArrayList<String> nameList = new ArrayList<>(); //리스트형을 제작할 때, 가변적, 데이터 관리하기 편함
    Scanner scName = new Scanner(System.in); //입력받을 스캐너 객체 (이름)
    Scanner scMenu = new Scanner(System.in); //입력받을 스캐너 객체 (메뉴)
    String name; //문자열 변수
    int choice; //메뉴 입력 변수
    boolean flag = true; //프로그램 동작 여부

    while(flag){

        System.out.println("=============");
        System.out.println("1.입력");
        System.out.println("2.출력");
        System.out.println("3.종료");

        System.out.println("=============");
        System.out.println("1.입력");
        choice = scMenu.nextInt();
        //넥스트 라인은 띄워쓰기 허용
        switch(choice){
            case 1: //입력
                System.out.println("등록할 이름을 입력 : ");
                name = scName.nextLine();

                nameList.add(name);
                break;

            case 2: //출력
                //while - 횟수를 정확히 모를 때 조건을 걸어둔다.
                for(int i=0; i<nameList.size(); i++){

                    System.out.println(i);
                    System.out.println(", "+nameList.get(i));

                }


                break;

            case 3: //삭제

                System.out.println("삭제할 이름을 입력 : ");
                name = scName.nextLine();

                for(int i=0; i<nameList.size(); i++){

                    if (name.equals(nameList.get(i))) { //같은 문자열이 있을 경우
                        nameList.remove(i);


                    }

                }

                System.out.println("삭제완료!");


                break;

            case 4: //종료
                flag = false;
                System.out.println("***프로그램 종료***");
                break;

        }

    }

    //어떤 로직을 사용할 지
    //for while switch
    //메뉴 입력을 계속 받아야 하기 때문에 반복문 사용




}
//map

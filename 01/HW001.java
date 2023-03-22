/* 2023.03.21 첫 자바 교육

유지보수를 하기 위해 다양한 클래스를 둔다

jsp = java와 html 합쳐놓은 느낌

자바 클래스와 메서드로 구성 => 합쳐서 프로그램으로 함


주제 주시면 바로 당일 프로그램 만들기~23(목)
2~3일 간격으로 프로그램 숙제

1. 등록부
자바, 절차지향적으로(한 클래스에 때려박기)
리스트(배열)을 다룸
// 이름 등록
// 사용할 변수

과제 : 삭제 할 이름을 입력했는데 없으면 "없다"는 안내문
있으면 " 삭제가 완료되었다는 안내문 -> count로 해결

만들고 대리님이 객체지향으로 보여주심(정답지)

 */
import java.time.Clock;
import java.util.ArrayList;
import java.util.Scanner;

public class HW001 {

    public static void main(String[] args) {
        //프로그램 시작
        //1. 이름 등록

        ArrayList<String> nameList = new ArrayList<>(); //이름등록부

        Scanner scName=new Scanner(System.in);//입력받을 스캐너 객체 (이름)
        Scanner scMenu=new Scanner(System.in);//입력받을 스캐너 객체 (메뉴)

        String name;//문자열 변수
        int choice;// 메뉴 입력 변수
        boolean flag=true; //프로그램 동작 여부


        while(flag){

            System.out.println("=============");
            System.out.println("1.입력");
            System.out.println("2.출력");
            System.out.println("3.삭제");
            System.out.println("4.종료");
            System.out.println("=============");
            System.out.println("메뉴 입력 :");
            choice= scMenu.nextInt();

            switch(choice){

                case 1: //입력
                    System.out.println("등록할 이름을 입력 : ");
                    name=scName.nextLine();

                    nameList.add(name);

                    break;
                case 2: //출력

                    for(int i=0; i< nameList.size(); i++){

                        System.out.print(i);
                        System.out.println(". "+nameList.get(i));

                    }

                    break;
                case 3:

                    System.out.println("삭제할 이름을 입력 : ");
                    name=scName.nextLine();

                    for(int i=0; i< nameList.size(); i++){

                        if(name.equals(nameList.get(i))){//같은 문자열이 있을경우
                            nameList.remove(i);
                        }

                    }

                    System.out.println("삭제완료!");
                    break;

                case 4: //종료
                    flag=false;
                    System.out.println("******프로그램 종료");
                    break;

            }

        }

    }

}
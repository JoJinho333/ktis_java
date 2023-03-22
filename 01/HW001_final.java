/*
이름을 등록하는 등록부

입력, 출력, 삭제, 프로그램 종료하는 기능을 가진다.

입력은 scanner 입력 객체 / 입력했으면 리스트에 추가 ( add 메소드 )

출력은 system.out / 단순 출력하면 list 형태로 출력, for문으로 list[i]형태로 출력

삭제는 for문으로 nameList를 전체 훑고 삭제하고 싶은 이름과 nameList에 같은게 있다면(equals) 삭제, 없으면 없다는 안내문을 출력

종료는 while문을 false로 바꾼다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class HW001_final {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        Scanner scName = new Scanner(System.in);
        Scanner scMenu = new Scanner(System.in);

        String name;
        int choice;
        int count = 0;
        boolean flag = true;

        while(flag){

            System.out.println("=====================");
            System.out.println("1.이름 입력");
            System.out.println("2.이름 출력");
            System.out.println("3.이름 삭제");
            System.out.println("4.프로그램 종료");
            System.out.println("=====================");
            System.out.println("번호 선택 : ");

            choice = scMenu.nextInt();
            
            switch(choice){
                case 1:  //입력

                    System.out.println("이름을 입력하세요.");

                    name = scName.nextLine();
                    nameList.add(name);

                    System.out.println(name +"가 입력되었습니다.");
                    System.out.println("현재 등록 인원은 "+nameList.size()+"명 입니다.");
                    count++;

                    break;
                    
                case 2:  //출력

                    System.out.println("등록된 명단을 보여드리겠습니다.");

                    for(int i=0; i<nameList.size(); i++) {

                        //System.out.println( nameList.indexOf(i)+1 +". " + nameList.get(i));
                        System.out.println( i+1 +". " + nameList.get(i));

                    }

                    break;
                    
                case 3:  //삭제

                    // 삭제하려면 있는지 확인해야 하니깐 equals

                    System.out.println("삭제할 이름을 입력하세요.");
                    name = scName.nextLine();

                    for(int i=0; i< nameList.size(); i++){

                        if(name.equals(nameList.get(i))){

                            nameList.remove(i);

                        }

                    }

                    if(count != nameList.size()){

                        System.out.println("삭제 완료되었습니다.");
                        count--;

                    } else {

                        System.out.println("작성하신 이름이 없습니다.");

                    }
                    
                    break;
                    
                case 4:  //종료

                    System.out.println("프로그램이 종료됩니다.");
                    flag = false;

            }
        }
    }
}
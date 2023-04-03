import java.util.ArrayList;
import java.util.Scanner;

/*
이름을 등록하는 등록부
1. 입력
2. 출력
3. 삭제
4. 프로그램 종료
 */
public class HW001_a {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList();

        Scanner scName = new Scanner(System.in);
        Scanner scMenu = new Scanner(System.in);


        String name;
        int choice;
        int count = 0;
        boolean flag = true;

        while(flag){

            System.out.println("====================");
            System.out.println("1. 이름 입력");
            System.out.println("2. 이름 출력");
            System.out.println("3. 이름 삭제");
            System.out.println("4. 프로그램 종료");
            System.out.println("====================");
            System.out.println("메뉴 선택 : ");

            choice = scMenu.nextInt();

            switch(choice){

                case 1: //입력

                    System.out.println("이름을 입력하세요");

                    name = scName.nextLine();
                    nameList.add(name);
                    count++;

                    break;

                case 2: //출력

                    for(int i=0; i< nameList.size(); i++){
                        System.out.println(i+1 +". "+ nameList.get(i));
                    }

                    break;

                case 3: //삭제

                    System.out.println("삭제할 이름을 입력하세요");
                    name = scName.nextLine();

                    for(int i=0; i< nameList.size(); i++){

                        if(name.equals(nameList.get(i))){
                            nameList.remove(i);
                        }
                    }

                    if(count != nameList.size()){
                        System.out.println("삭제가 완료되었습니다.");
                        count--;
                    } else{
                        System.out.println("이름이 없습니다.");
                    }


                    break;

                case 4: // 종료

                    System.out.println("프로그램 종료합니다.");
                    flag = false;
            }


        }


    }
}

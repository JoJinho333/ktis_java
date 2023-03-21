import java.util.ArrayList;
import java.util.Scanner;

public class HW001_p {
    public static void main(String[] args) {

        // 추가 & 변형
        // 이름 등록부와 메뉴 등록부를 만들어서 switch case 1: case 2: 문으로 접근
        // 그 안에 들어있는 구성은 같게

        ArrayList<String> nameList = new ArrayList<>(); // 이름 등록부
        ArrayList<String> menuList = new ArrayList<>(); // 메뉴 등록부

        Scanner scChoice = new Scanner(System.in);
        Scanner scName = new Scanner(System.in);
        Scanner scMenu = new Scanner(System.in);

        String name;
        String menu;

        int choice_fst;
        int choice_sec;

        boolean flag = true;

        while(flag) {

            System.out.println("==========================");
            System.out.println("1. 이름 등록부");
            System.out.println("2. 메뉴 등록부");
            System.out.println("==========================");
            System.out.println("등록부 선택 : ");

            choice_fst = scChoice.nextInt();

            switch(choice_fst){

                case 1: // 이름 등록부

                    System.out.println("===============");
                    System.out.println("1. 이름 입력");
                    System.out.println("2. 이름 출력");
                    System.out.println("3. 이름 삭제");
                    System.out.println("4. 프로그램 종료");
                    System.out.println("===============");

                    choice_sec = scChoice.nextInt();

                    switch(choice_sec){

                        case 1: // 입력

                            System.out.println("이름 입력 : ");
                            name = scName.nextLine();
                            nameList.add(name);

                            break;

                        case 2: //출력

                            for(int i=0; i<nameList.size(); i++) {

                                System.out.print(i);
                                System.out.println(". "+nameList.get(i));

                            }

                            break;

                        case 3: // 삭제

                            System.out.println("삭제할 이름을 입력 :");
                            name=scName.nextLine();

                            for(int i=0; i<nameList.size(); i++){

                                if (name.equals(nameList.get(i))){
                                    nameList.remove(i);
                                }
                            }

                            break;

                        case 4: // 종료
                            flag = false;
                            System.out.println("***프로그램 종료***");

                    }

                    break;

                case 2: // menu 등록부

                    System.out.println("===============");
                    System.out.println("1. 메뉴 입력");
                    System.out.println("2. 메뉴 출력");
                    System.out.println("3. 메뉴 삭제");
                    System.out.println("4. 프로그램 종료");
                    System.out.println("===============");

                    choice_sec = scChoice.nextInt();

                    switch(choice_sec){
                        case 1: // 입력

                            System.out.println("메뉴 입력 : ");
                            menu = scMenu.nextLine();
                            menuList.add(menu);

                            break;

                        case 2: //출력

                            for(int i=0; i<menuList.size(); i++) {

                                System.out.print(i);
                                System.out.println(". "+menuList.get(i));

                            }

                            break;

                        case 3: // 삭제

                            System.out.println("삭제할 이름을 입력 :");
                            menu=scMenu.nextLine();

                            for(int i=0; i<menuList.size(); i++){

                                if (menu.equals(menuList.get(i))){
                                    menuList.remove(i);
                                }
                            }

                            break;

                        case 4: // 종료
                            flag = false;
                            System.out.println("***프로그램 종료***");

                    }

                    break;

                    }
            }
        }
    }


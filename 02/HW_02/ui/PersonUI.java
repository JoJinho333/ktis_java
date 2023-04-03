package ui;

import manager.PersonManager;
import vo.Person;

import java.util.Scanner;

/*
1.입력
2.출력
3.삭제
4.프로그램 종료
+추가 : 3번에 수정 기능 부여 - 같은 주민번호를 입력받았을 때 이름을 수정하게끔
 */
public class PersonUI {

    private PersonManager personManager = new PersonManager();
    private Scanner scString = new Scanner(System.in);
    private Scanner scInt = new Scanner(System.in);
    private boolean flag = true;
    private int choice;

    public PersonUI() {

        while (flag) {

            menu();
            choice = scInt.nextInt();

            switch (choice) {
                case 1:
                    registPerson();
                    break;

                case 2:
                    printAll();
                    break;

                case 3:
                    updatePerson();
                    break;

                case 4:
                    deletePerson();
                    break;

                case 5:
                    flag = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }

    public void menu() {

        System.out.println("===================");
        System.out.println("1. 등록");
        System.out.println("2. 출력");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.println("===================");
        System.out.println("선택지를 고르세요.");
    }

    public void registPerson() {

        System.out.println("이름을 입력");
        String name = scString.nextLine();
        System.out.println("주민번호를 입력");
        String ssn = scString.nextLine();

        boolean result = personManager.registPerson(new Person(name, ssn));

        if (!result) {
            System.out.println("등록성공.");
        } else {
            System.out.println("등록실패.");

            //update();

        }
    }

    public void printAll() {
        for (Person person : personManager.getPersonList()) {
            System.out.println(person);
        }
    }

    public void updatePerson() {

        System.out.println("주민번호를 입력");
        String ssn = scString.nextLine();

        System.out.println("이름을 입력하세요.");
        String name = scString.nextLine();

        System.out.println("수정할 이름을 입력하세요.");
        String name2 = scString.nextLine();

        boolean result = personManager.updatePerson(ssn, name, name2);

        if (!result) {
            System.out.println("수정성공.");

        } else {
            System.out.println("수정실패.");
        }
    }

    public void deletePerson() {
        System.out.println("삭제할 주민번호를 입력 해주세요.");
        String ssn = scString.nextLine();

        boolean result = personManager.deletePerson(ssn);

        if (result) {
            System.out.println("삭제완료");
        } else {
            System.out.println("삭제실패");
        }
    }
}
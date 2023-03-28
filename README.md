# ktis_java
### 2023.03.21 - 첫 번째 자바 수업 (절차지향으로 프로그래밍)
유지보수를 하기 위해 다양한 클래스를 둔다

jsp = java와 html 합쳐놓은 느낌

자바 클래스와 메서드로 구성 => 합쳐서 프로그램으로 함


주제 주시면 바로 당일 프로그램 만들기 - 23(목)까지
2-3일 간격으로 프로그램 숙제

1. 등록부
자바, 절차지향적으로(한 클래스에 때려박기)
리스트(배열)을 다룸
// 이름 등록
// 사용할 변수 

과제 : 삭제 할 이름을 입력했는데 없으면 "없다"는 안내문
있으면 " 삭제가 완료되었다는 안내문 -> count로 해결

만들고 대리님이 객체지향으로 보여주심(정답지)


### 2023.03.24 - 두 번째 자바수업 (객체지향으로 프로그래밍)
유지보수를 위해 클래스를 나눈다

vo
필드와 생성자(일종의 메서드인데, 생성할 때 단 한 번 호출됨)


기본 생성자는 어느 클래스에든 다 있다
생성자 사용법 - 만드는 이유는 

this는 이 클래스를 의미

명시적 생성자
오버로딩 : 생성자 이름은 같지만 파라미터를 다르게 하여 각자 다른 동작
오버라이드 : 메소드 기능 재설정(재정의)

(빌더 패턴)

캡슐화를 통해 데이터의 접근을 제한

private - 타 클래스 메소드에서 접근할 수 없다
public으로 하면 타 클래스에서 접근 가능(직접 호출이 가능)

항상 메소드를 통해서 인자 값을 주고 받는다

arraylist<> 괄호 안에 클래스가 들어갈 수도 있고 타입이 들어갈 수도 있다


전제 : 코드 보지 말고 맨땅에 바로 코딩
과제 1: 수정기능
같은 주민번호를 입력을 받아서 이름을 수정하는 역할 ( 3번으로 수정 기능을 만들어서 주민번호를 입력했을 때 이름을 수정하는 코드 )

springboot와 springframework가 있으나
다음 수업은 springboot로 함

https://github.com/hjk7902/spring
-> 미리 조금 공부하기


[이해가 안되는 것]
setter를 통해서 private으로 된 곳에 넣는다 -> 설명 다시 한 번 요청
public void - 언제 void를 적어주는건지
=> 우선 객체지향으로 해보고 이해가 안되면 다음 시간 시작할 때 질문하기

### 2023.03.28 - 세 번째 수업 - 스프링부트 - Controller
프론트엔드 3요소를 타임리프로 만들기

컨트롤러 : 로직 처리 없이, 요청을 받아서 단순히 넘겨주는 아이
서비스 : 로직 처리
레포지토리 : 트랜잭션 처리

생산성(유지보수)을 높이기 위해 

서브릿과 jsp는 사용X
디스패처 서브릿의 구조를 

파란색은 많이 건들지 않는다
빨간색은 많이 만지는 것

스프링 mvc 는 페이지를 넘겨주고

restful은 페이지를 안보여주고 데이터를 넘겨준다


msa 마이크로 소프트 아키텍처 - 



컨트롤러가 작동
클래스 패키지 위치를 잘못 설정했거나

spring.bin으로 등록해야 한다.

스프링 컨테이너가 

컴포넌트 스캔 : 스프링 컨테이너가 ~~~을 찾는 것


컨트롤러에 있는 getMapping에서 return해주는 값에 .html을 붙여 그 페이지를 화면에 띄워준다.

레스트 컨트롤러는 데이터를 넘겨줌

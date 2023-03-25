package vo;

public class Person {


    //필드
    private String name;
    private String ssn;

    //생성자 - 일종의 메서드, 생성할 때 단 한 번 호출됨
    public Person(String name, String ssn){
        this.name=name;
        this.ssn=ssn;
    }

    public Person(){

    }

    //getter
    public String getName(){
        return name;
    }

    public String getSsn(){
        return ssn;
    }

    //setter
    public void setName(String name){
        this.name=name;
    }

    public void setSsn(String ssn){
        this.ssn=ssn;
    }

    @Override
    public String toString(){
        return "이름 : "+this.name+", 주민번호 : "+this.ssn;
    }

}

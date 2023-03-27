package vo;



public class Person {

    private String name;
    private String ssn;


    public Person(String name, String ssn){
        this.name=name;
        this.ssn=ssn;
    }

    public Person(String ssn){
        this.ssn=ssn;
    }


    public String getName() {
        return name;
    }

    public String getSsn(){
        return ssn;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSsn(String ssn){
        this.ssn=ssn;
    }

    @Override
    public String toString(){
        return "이름 : "+this.name +", 주민번호 : "+this.ssn;
    }


}



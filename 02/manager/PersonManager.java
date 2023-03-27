package manager;

import vo.Person;

import java.util.ArrayList;

public class PersonManager {

    private ArrayList<Person> personList=new ArrayList<>();
    private String tempName;
    //등록
    public boolean registPerson(Person person){

        boolean isDuplicated=false;

        for(int i=0;i<personList.size();i++){
            if(personList.get(i).getSsn().equals(person.getSsn())){
                isDuplicated=true;
            }
        }

        if(!isDuplicated){
            personList.add(person);
        }
        return isDuplicated;
    }

    public boolean updatePerson(Person person){

        boolean isDuplicated=false;
        for(int i=0;i<personList.size();i++){
            if(personList.get(i).getSsn().equals(person.getSsn())){
                isDuplicated=true;
                tempName = person.getSsn();
            }
        }
        if(!isDuplicated){
            tempName.replace()

            personList.add(person);
        }
        return isDuplicated;

    }


    public ArrayList<Person> getPersonList(){
        return personList;
    }


    public boolean deletePerson(String ssn){

        boolean isDuplicated=false;

        for(int i=0;i<personList.size();i++){

            if(personList.get(i).getSsn().equals(ssn)){
                personList.remove(i);
                isDuplicated=true;
            }

        }

        return isDuplicated;
    }
}
package manager;

import vo.Person;

import java.util.ArrayList;

public class PersonManager {

    private ArrayList<Person> personList=new ArrayList<>();

    //등록
    public boolean registPerson(Person person){

        boolean isDuplicated=false; //중복X

        for(int i=0;i<personList.size();i++){

            if(personList.get(i).getSsn().equals(person.getSsn())){
                isDuplicated=true; //중복O

                //personList.replaceAll(tempName);
                //String tempName = person.getName();
                //String newName = tempName.replace(tempName, );

            }
        }

        if(!isDuplicated){
            personList.add(person);
        }
        return isDuplicated;
    }
/*
입력을 해
주민번호가 같아 -> 이름을 수정을 해

김민수, 123-123
김수민, 123-123


    public void Change(Person person){

        for(int i=0;i<personList.size();i++){
            if(personList.get(i).getName().equals(person.getName())){
                String tempName = personList.get(i).getName();

                String temp;
                String newName = tempName.replace(tempName, );

            }else{

            }
        }

    }
     */


    public boolean updatePerson(String name, String ssn, String name2){

        boolean isDuplicated = false; //중복X

        for(int i=0;i<personList.size();i++){
            if(personList.get(i).getName().equals(name)){

                //String tempName = personList.get(i).getName();

                //String temp;
                //String newName = tempName.replace(tempName, );
                isDuplicated=false;

                //personList.set(i, );
            }else{
                isDuplicated=true;
            }
        }

        if(!isDuplicated){

            String newPerson = name.replace(name, name2);
            personList.add(new Person(newPerson, ssn));
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
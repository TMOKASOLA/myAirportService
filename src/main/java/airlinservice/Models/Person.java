package airlinservice.Models;


public class Person {

    int idNum, cellNum;
    String name, surnname, email, gender;

    //getter methods
    public int getIdNum(){return idNum;}

    public int getCellNum() {return cellNum;}

    public String getName(){return name;}

    public String getSurnname() {return surnname;}

    public String getEmail(){return email;}

    public String getGender(){return gender;}

    //setter methods
    public void setIdNum(int theIdNum){
        idNum = theIdNum;
    }

    public void setCellNum(int theCellNum){
        cellNum = theCellNum;
    }

    public void setName(String clientName){
        name = clientName;
    }

    public void setSurnname(String clientSurname){
        surnname = clientSurname;
    }

    public void setEmail(String clientEmail){
        email = clientEmail;
    }

    public void setGender(String clientGender){
        gender = clientGender;
    }


}

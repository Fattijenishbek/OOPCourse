package contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ContactsManager {
    Contact [] myContacts;
    int contsctCount;

    ContactsManager(){
        this.contsctCount=0;
        this.myContacts=new Contact[10];
    }
    public void addContact(Contact contact){
        myContacts[contsctCount]=contact;
        contsctCount++;
    }
    String searchContact(String search){
        for (int i=0; i< contsctCount; i++){
            if(myContacts[i].name.equals(search)){
                return myContacts[i].phoneNumber;
            }else if( myContacts[i].phoneNumber.equals(search)){
                return myContacts[i].name;
            }
        }
        return "You don't have a such contact!";
    }

}

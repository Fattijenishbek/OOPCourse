package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ContactsManager myContactsManager = new ContactsManager();

        Contact friendNatalia=new Contact();
        friendNatalia.name="Natalia";
        friendNatalia.phoneNumber="0777888999";
        myContactsManager.addContact(friendNatalia);

        Contact friendMirkhad=new Contact();
        friendMirkhad.name="Mirkhad";
        friendMirkhad.phoneNumber="0777898989";
        myContactsManager.addContact(friendMirkhad);

        Contact friendAiperi=new Contact("Aiperi", "0555666777");
        myContactsManager.addContact(friendAiperi);

        Contact friendSezim=new Contact("Sezim","0555656565");
        myContactsManager.addContact(friendSezim);

        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println(myContactsManager.searchContact(name));

    }
}
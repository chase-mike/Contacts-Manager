public class mainMenu {
    public static void main(String[] args) throws Exception {

        while(true){
            int userChoice = updateContacts.mainMenu(args);//utilizes mainMenu Method within upDateContacts Class, and grabs users Input
            if(userChoice == 1) {
                updateContacts.printList();// if users input is 1 printList Method will be used
            } else if (userChoice == 2) {
                updateContacts.addContact();// if users input is 2, addPerson Method will be used
            } else if ( userChoice == 3) {
                updateContacts.searchLast();// if users input is 3, searchByLastName Method will be used
            } else if (userChoice == 4) {
                updateContacts.deleteContact();// if users input is 4, deleteContact Method will be used
            } else if( userChoice == 5){
                updateContacts.exit();// if users input is 5, exit method will be used
           } else {
           System.out.println("Invalid Input");// andything else will sout "Invalid Input"
            }
        }
    }
}


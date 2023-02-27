public class mainMenu {
    public static void main(String[] args) throws Exception {

        while(true){
            int userChoice = updateContacts.mainMenu(args);
            if(userChoice == 1) {
                updateContacts.printList();
            } else if (userChoice == 2) {
                updateContacts.addContact();
            } else if ( userChoice == 3) {
                updateContacts.searchLast();
            } else if (userChoice == 4) {
                updateContacts.deleteContact();
            } else if( userChoice == 5){
                updateContacts.exit();
           } else {
           System.out.println("Invalid Input");
            }
        }
    }
}


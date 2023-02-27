public class main {
    public static void main(String[] args) {

        while(true){
            int userChoice = updateContacts.mainMenu();
            if(userChoice == 1){
                updateContacts.printList();
            else if (userChoice == 2){
                updateContacts.addPerson();
            else if ( userChoice == 3){
                updateContacts.searchByLastName();
            else if (userChoice == 4){
                updateContacts.deleteContact
            else if( userChoice == 5){
                updateContacts.exit();
           }else {
           System.out.println("Invalid Input");
                            }
                        }
                    }
                }
            }
        }

    }
}

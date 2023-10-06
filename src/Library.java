public class Library {
LibraryItem [] collection= new LibraryItem[100];
int counter = 0;
public void addItem(LibraryItem item){
    collection[counter++] = item;



}
public void borrowItem(LibraryItem item){

        for (int i = 0; i < counter; i++) {
            if (collection[i].equals(item)) {
                collection[i].setIsBorrowed(true);
                return;
            }
        }



}
public void returnItem(LibraryItem item) {
    for (int i = 0; i < counter; i++) {
        if (collection[i].equals(item) && collection[i].isBorrowed()) {
            collection[i].setIsBorrowed(false);
            return;
        }
    }
}
        public void displayAvailableItems() {
            for (int i = 0; i < counter; i++) {
                if (!collection[i].isBorrowed()) {
                    System.out.println(collection[i].getTitle());
                }
            }
        }
            public void displayBorrowedItems(){
                for (int i = 0; i < counter; i++) {
                    if (collection[i].isBorrowed()) {
                        System.out.println(collection[i].getTitle());
                    }
                }

        }

    }


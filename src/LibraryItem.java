import java.util.Objects;

public class LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean isBorrowed;
    private LibraryItemType itemType;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }

    public LibraryItem(String title, String author, int year, LibraryItemType itemType) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.itemType = itemType;
    }



    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryItem that = (LibraryItem) o;
        return year == that.year && isBorrowed == that.isBorrowed && Objects.equals(title, that.title) && Objects.equals(author, that.author) && itemType == that.itemType;
    }


    public boolean isBorrowed() {
        return isBorrowed;
    }
}

package models;

public class Library {

    private int id;
    private Set<Borrower> borrowers;

    public Library() {
        this.id = id;
        this.borrowers= new Set<Borrower>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Borrower> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(Set<Borrower> borrowers) {
        this.borrowers = borrowers;
    }
}
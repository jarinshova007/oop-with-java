package uml9;

public class Member {
    private int memberId;
    private String name;

    Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // borrow book

    // return book
    public void returnBook() {
    }

    public void displayMember() {
        System.out.println("Member Id: " + memberId);
        System.out.println("Name: " + name);
    }
}

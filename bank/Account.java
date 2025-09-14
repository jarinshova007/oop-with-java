package bank;
class Account {
    public String name;

    public void printInfo() {
        System.out.println(name);
    }

    Account(String name) {
        this.name = name;
    }
    Account() {

    }
}
package stringbasic;

public class Person {
    private String name;
    private String email;
    private String taj;
    private String bankNum;
    private String phoneNum;

    public Person(String name, String email, String taj, String bankNum, String phoneNum) {
        this.name = name;
        this.email = email;
        this.taj = taj;
        this.bankNum = bankNum;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTaj() {
        return taj;
    }

    public void setTaj(String taj) {
        this.taj = taj;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return name;
    }
}

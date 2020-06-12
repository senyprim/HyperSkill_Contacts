package contacts;

public class Contacts {
    private String name;
    private String fam;
    private String phone;

    public Contacts(String name, String fam, String phone) {
        this.name = name;
        this.fam = fam;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getFam() {
        return fam;
    }

    public String getPhone() {
        return phone;
    }
}

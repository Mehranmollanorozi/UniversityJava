package tamrin1;

public class Information {
    //nam , namhaghighi ,password, age ,adress , shomare mobile,tahsilat
    private String name;
    private String realname;
    private int password;
    private int age;
    private String address;
    private long phonenumber;
    private String education;

    public String getName() {
        return name;
    }

    public Information setName(String name) {
        this.name = name;
        return this;
    }

    public String getRealname() {
        return realname;
    }

    public Information setRealname(String realname) {
        this.realname = realname;
        return this;
    }

    public int getPassword() {
        return password;
    }

    public Information setPassword(int password) {
        this.password = password;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Information setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Information setAddress(String address) {
        this.address = address;
        return this;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public Information setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public String getEducation() {
        return education;
    }

    public Information setEducation(String education) {
        this.education = education;
        return this;
    }
}

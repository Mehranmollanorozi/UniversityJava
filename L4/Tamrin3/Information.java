package tamrin3;

public class Information<First,Second,Third> {
    //name   // code daneshjoi //name pedar
    private First name;
    private Second universitycode;
    private Third fathername;
    public First getName() {
        return name;
    }

    public void setName(First name) {
        this.name = name;
    }

    public Second getUniversitycode() {
        return universitycode;
    }

    public void setUniversitycode(Second universitycode) {
        this.universitycode = universitycode;
    }

    public Third getFathername() {
        return fathername;
    }

    public void setFathername(Third fathername) {
        this.fathername = fathername;
    }
}

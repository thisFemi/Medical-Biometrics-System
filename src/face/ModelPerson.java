package face;

public class ModelPerson {
// 
    private int id;
    private String first_name, dob, phone,address , nextOfKin, bGandGenotype, allergies, lastReport, date, extra, image;
   private int finger;

    public ModelPerson() {
    }

    public ModelPerson(String first_name, String phone, String image) { //LastPerson
        this.first_name = first_name;
        this.phone = phone;
        this.image = image;
    }

    public ModelPerson(int id, String first_name, String dob,  String phone, String address, String nextOfKin, String bGandGenotype, String allergies,String lastReport,String extra, String date, int finger) {
        this.id = id;
        this.first_name = first_name;
       // this.last_name = last_name;
        this.dob = dob;
        this.phone =phone  ;
        this.address = address;
        this.nextOfKin = nextOfKin;
        this.bGandGenotype = bGandGenotype;
        this.allergies = allergies;
        this.lastReport= lastReport;
        this.extra=extra;
        this.date = date;
         this.finger = finger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getnextOfKin() {
        return nextOfKin;
    }

    public void setnextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getbGandGenotype() {
        return bGandGenotype;
    }

    public void setbGandGenotype(String bGandGenotype) {
        this.bGandGenotype = bGandGenotype;
    }

    public String getallergies() {
        return allergies;
    }

    public void setallergies(String allergies) {
        this.allergies = allergies;
    }

    public String getlastReport() {
        return lastReport;
    }

    public void setlastReport(String lastReport) {
        this.lastReport = lastReport;
    }
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the finger
     */
    public int getFinger() {
        return finger;
    }

    /**
     * @param finger the finger to set
     */
    public void setFinger(int finger) {
        this.finger = finger;
    }

}

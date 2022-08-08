public abstract class Officer extends Employee{
    private String department;
    private String shift;

    public Officer(String nameSurname, String mp, String email,String department, String shift){
        super(nameSurname, mp, email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void calis(){
        System.out.println(this.getNameSurname() + " görevlerini yapmaktadır.");
    }

    @Override
    public void giris(){
        System.out.println(this.getNameSurname() + " memuru C kapısından giriş yaptı !");
    }
}

public abstract class Academician extends Employee{
    private String department;
    private String title;
    public Academician(String nameSurname, String mp, String email, String department, String title){
        super(nameSurname, mp, email);
        this.department = department;
        this.title = title;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void derseGir(String dersSaati);

    @Override
    public void giris(){
        System.out.println(this.getNameSurname() + " akademisyeni A kapısından giriş yaptı.");
    }

}

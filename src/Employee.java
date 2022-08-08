public abstract class Employee {
    private String nameSurname;
    private String mp;
    private String email;

    public Employee(String nameSurname, String mp, String email) {
        this.nameSurname = nameSurname;
        this.mp = mp;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void giris(){
        System.out.println(this.nameSurname + " üniversiteye giriş yaptı !!");
    }

    public void cikis(){
        System.out.println(this.nameSurname + " üniversiteden çıkış yaptı !!");
    }

    public void yemekhane(){
        System.out.println(this.nameSurname + " yemekhaneye giriş yaptı !!");
    }

    public static void girisYapanlar(Employee[] employees){
        for(Employee employee : employees)
        {
            employee.giris();
        }
    }
}

public class TrainingPersonal extends Academician{
    private String no;
    public TrainingPersonal(String nameSurname, String mp, String email,
                            String department, String title, String no ){
    super(nameSurname, mp, email, department, title);
    this.no = no;
    }

    public String getNo(){
        return this.no;
    }

    public void setNo(String no){
        this.no = no;
    }

    @Override
    public void giris(){
        System.out.println(this.getNameSurname() + " öğretim görevlisi B kapısından giriş yaptı.");
    }

    @Override
    public void derseGir(String saat){
        System.out.println(this.getNameSurname() + " öğretim görevlisi derse " + saat + " giriş yaptı.");
    }
}

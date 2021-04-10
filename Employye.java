package Classes;

import Business.BusinessUnit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employye {
    private String name;
    private String lastname;
    private int age;
    private String Id;
    private String email;
    private Supervisor mi_supervisor;
    protected float salary;
    private BusinessUnit bu;

//el problema es que el nombre que queda almacenado cuando se inicializa y caundo se setea lo qque imprime es el nombre con el quese inicializo

    public Employye(String id, String name, String lastname, int age,String emai) {
        this.Id = id;
        this.name = name;
        this.lastname = lastname;
        this.setAge(age);
        this.salary = 0;
        this.email=emai;
    }



    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age <= 1 || age >= 100 ){
            age = 1;
            System.out.println("WARNING: EL valor enviado no se encuentra de los rangos espesificados [1,99], POR LO TANTO EL VALOR FUE SET CON 1");
        }
        this.age = age;
    }

    public Supervisor getMi_supervisor() {
        return this.mi_supervisor;
    }

    public void setMi_supervisor(Supervisor mi_supervisor) {

        this.mi_supervisor = mi_supervisor;
    }

    public String Presentation(){
        return this.Id + " - " + this.name + " " + this.lastname;
    }

    public BusinessUnit getBu() {
        return this.bu;
    }

    public void setBu(BusinessUnit bu) {
        this.bu = bu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(email);
        if(mat.find()){
            System.out.println("Correo Válido");
        }else{
            System.out.println("Correo No Válido");
        }
        this.email = email;
    }
}


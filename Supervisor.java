package Classes;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employye{

    private final List<Employye> employees;


    public Supervisor(String id, String name, String lastname, int age, String email) {
        super(id, name, lastname, age, email);
        this.employees = new ArrayList<Employye>();
    }

    public void AssignNewEmployee(Employye e){
        this.employees.add(e);
    }

    public void PrintEmployees(){

        System.out.println("This supervisor(" + super.getName() + ") has as employees:");

        for( Employye e : this.employees ){
            System.out.println(e.Presentation());
        }
    }

    public void setEmployeeSalary(Employye e, float s){
        if(this.getId() == e.getMi_supervisor().getId()){
            e.salary = s;
        }else {
            System.out.println("WARNING: SUPERVISOR NO TIENE LOS ACCESOS PARA MODIFICAR LA INFORMACION DEL EMPLEADO ENVIADO");
        }


    }
}

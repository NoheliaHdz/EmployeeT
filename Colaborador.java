package Classes;


import java.util.ArrayList;
import java.util.List;

public class Colaborador extends Employye {

    private List<String> programmingLanguages;

    public Colaborador(String id, String name, String lastname, int age, String emal) {
        super(id, name, lastname, age, emal);

        programmingLanguages = new ArrayList<String>();
    }

    public void AddNewLanguage(String language){
        this.programmingLanguages.add(language);
    }

    public void PrintMyLanguages(){

        System.out.println( super.getId() + " knows the follow languages: " );

        for(String languages : this.programmingLanguages){
            System.out.println(languages);
        }
    }

    public String getSalaryInfo(){
        String respuesta = "Salario Malo";
        if( super.salary >= 2000 ){
            respuesta = "Salario bueno";
        }
        return respuesta;
    }

}

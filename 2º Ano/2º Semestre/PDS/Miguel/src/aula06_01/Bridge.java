package aula06_01;

public class Bridge {
    Database db;
    Registos reg;
    public Bridge(){
        db = new Database();
        reg = new Registos();
    }
    public <T> void addEmployee(T emp){
        if(emp instanceof Empregado){
             reg.insere((Empregado) emp);
        }
        else if(emp instanceof Employee){

            db.addEmployee((Employee) emp);
        }
       else{
            System.err.printf("ERROR: Invalid type %s to add",emp.getClass());
        }
    }

    public void remove(int codigo){

    }

}

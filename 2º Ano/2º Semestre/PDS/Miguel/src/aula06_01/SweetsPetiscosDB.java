package aula06_01;

public class SweetsPetiscosDB {
    Database db;
    Registos reg;

    public SweetsPetiscosDB(Database oldDB, Registos oldReg) {
        db = oldDB;
        reg = oldReg;
    }

    public SweetsPetiscosDB(Database oldDB) {
        db = oldDB;
        reg = new Registos();
    }

    public <T> void addEmployee(T emp) {
        if (emp instanceof Empregado) {
            reg.insere((Empregado) emp);
        } else if (emp instanceof Employee) {
            reg.insere(convertToEmpregado((Employee) emp));
        } else {
            System.err.printf("ERROR: Invalid type %s to add", emp.getClass());
        }
    }

    private Empregado convertToEmpregado(Employee emp) {
        if (emp != null) {
            return new Empregado(emp.getName(), "", ((int) emp.getEmpNum()), emp.getSalary());
        }
        return null;

    }

    public void remove(long num) {
        reg.remove((int) num);
        db.deleteEmployee(num);
    }

    public boolean isEmployee(long num) {
        // because Registos stores the IDs as an integer, we can make a direct comparison to avoid accessing the DB
        // if it's not equal
        boolean mightBeInReg = (((int) num) == num);
        boolean inDB         = false;
        boolean inReg        = false;
        // So, if it might be in the reg, we search
        if (mightBeInReg) {
            inReg = reg.isEmpregado((int) num);
        }

        if (!inReg) {
            for (Employee e : db.getAllEmployees()) {
                if (e.getEmpNum() == num) {
                    inDB = true;
                    break;
                }
            }
        }
        return reg.isEmpregado((int) num) || inDB;
    }

    public String printAllPersonnel() {
        StringBuilder sb              = new StringBuilder();
        String        employeeFormat  = "Nome: %15s\tSalário: %-7.2f\tID:%d\n";
        String        empregadoFormat = "Nome: %30s\tSalário: %-7.2f\tID:%d\n";
        for (Employee e : db.getAllEmployees()) {
            if (e != null) {
                sb.append(String.format(employeeFormat, e.getName(), e.getSalary(), e.getEmpNum()));
            }
        }

        for (Empregado e : reg.listaDeEmpregados()) {
            if (e != null) {
                sb.append(String.format(empregadoFormat, e.nome() + " " + e.apelido(), e.salario(), e.codigo()));
            }
        }

        return sb.toString();
    }

}

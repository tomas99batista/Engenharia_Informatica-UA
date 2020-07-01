package aula07_01;

public class MainTodosFaze {
    public static void main(String args[]) {
        EmployeeInterface j1 = new Employee("Rui", 23000);
        Manager           e1 = new Manager(new Employee("Luis", 40_000));
        TeamMember        x1 = new TeamMember(new Employee("Ana", 40_000));
        TeamMember        x2 = new TeamMember(j1);
        TeamMember        x3 = new TeamMember(e1);
        TeamLeader        t1 = new TeamLeader(j1);
        Manager t2 = new Manager(
                new TeamLeader(new TeamMember(new Employee("Bruna", 40_000))));
        EmployeeInterface lista[] = {j1, e1, x1, x2, x3, t1, t2};
        for (EmployeeInterface ji : lista) {
            ji.work();
        }
    }
}

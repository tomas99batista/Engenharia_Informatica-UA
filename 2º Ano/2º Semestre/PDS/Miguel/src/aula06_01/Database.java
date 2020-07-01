package aula06_01;

import java.util.Vector;
// Sweets
class Database { // Data elements
    private Vector<Employee> employees; // Stores the employees

    public Database() {
        employees = new Vector<>();
    }

    /**
     * Adds an employee to the database if he doesn't exist
     *
     * @param employee The Employee to add
     * @return whether the employee was added
     */
    public boolean addEmployee(Employee employee) {
        for(Employee emp : employees){
            if(emp.getEmpNum() == employee.getEmpNum()){
                return false;
            }
        }
        return employees.add(employee);
    }

    /**
     * Removes an Employee based on it's ID
     *
     * @param emp_num the ID of the Employee to remove
     */
    public void deleteEmployee(long emp_num) {
        Employee empToRemove = null;
        for (Employee emp : employees) {
            if (emp.getEmpNum() == emp_num) {
                empToRemove = emp;
            }
        }

        if (empToRemove != null) {
            employees.remove(empToRemove);
        }

    }

    /**
     * Obtains all of the employees
     *
     * @return the Array with all the employees
     */
    public Employee[] getAllEmployees() {
        Object[] uncastedEmployee = employees.toArray();
        Employee[] castedEmployee = new Employee[uncastedEmployee.length];
        for (int i = 0; i < uncastedEmployee.length; i++) {
            castedEmployee[i] = (Employee) uncastedEmployee[i];
        }
        return castedEmployee;
    }
}
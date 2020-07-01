package modelo;

import java.sql.*;


/* Esta classe insere 4 linhas na tabela "ALUNO" na base de dados "alunos" 
 */
public class AlunosInsert {
    public static void main(String args[]) {
    	
        String url = "jdbc:sqlite:Alunos.db";
        Connection con;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO ALUNO " +
            	 "VALUES ('Jos�', 1234, 1, 1)");
        	  stmt.executeUpdate("INSERT INTO ALUNO " +
               "VALUES ('Ana', 4321, 1, 2)");
            stmt.executeUpdate("INSERT INTO ALUNO " +
               "VALUES ('Maria', 2222, 2, 1)");
            stmt.executeUpdate("INSERT INTO ALUNO " +
               "VALUES ('Jo�o', 3333, 3, 1)");
            stmt.close();
            con.close();
            System.out.println("Inseridos 4 registos em ALUNO");

        } catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
    }
}

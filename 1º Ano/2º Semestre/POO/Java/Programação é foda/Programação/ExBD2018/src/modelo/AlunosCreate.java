package modelo;

import java.sql.*;

/* Esta classe cria a tabela "ALUNO" na base de dados "Alunos.db" criada previamente: */
public class AlunosCreate {
    public static void main(String args[]) {
    	
        String url = "jdbc:sqlite:Alunos.db";
        Connection con;
        String createString;
        createString = "create table ALUNO " +
                            "(NOME VARCHAR(32), " +
                            "NUMERO INTEGER, " +
                            "ANO INTEGER, " +
                            "TURMA INTEGER)";
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
            stmt.executeUpdate(createString);
            stmt.close();
            con.close();
            System.out.println("Tabela ALUNO criada");

        } catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
    }
}

package modelo;

import java.sql.*;


/* Esta classe l� o conte�do da tabela "ALUNO" na base de dados "alunos" 
 */
public class AlunosRetrieve {
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
            String nomeTabela = "aluno";
            ResultSet rs = stmt.executeQuery("select * from "+nomeTabela);
            int numCols = rs.getMetaData().getColumnCount();
            System.out.println("Conte�do da Tabela ALUNO");
            while (rs.next()) {	
            	for (int col=1; col<=numCols; col++) {	
            		String st = rs.getString(col);
	            	System.out.print(st + " | ");
	            }
	            System.out.println();
            }
            stmt.close();
            con.close();

        } catch(SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
    }
}

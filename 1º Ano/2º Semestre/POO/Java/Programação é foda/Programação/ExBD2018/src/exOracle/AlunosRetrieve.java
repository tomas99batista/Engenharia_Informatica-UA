package exOracle;
import java.sql.*;


/* Esta classe l� o conte�do da tabela "ALUNO" na base de dados "alunos" 
 */
public class AlunosRetrieve {
    public static void main(String args[]) {
    	
        String url = "jdbc:oracle:thin:scott/tiger@192.168.23.32:1521:test";
        String urlfora = "jdbc:oracle:thin:scott/tiger@193.137.232.45:1521:test";
        
        Connection con;
        Statement stmt;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(urlfora);
            stmt = con.createStatement();
           
            String nomeTabela = "emp";
            ResultSet rs = stmt.executeQuery("select * from "+nomeTabela);
            int numCols = rs.getMetaData().getColumnCount();
            System.out.println("Conte�do da Tabela EMP");
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

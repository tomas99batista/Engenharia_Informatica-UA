/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quitério
 */
public class UtilBD {

    public UtilBD() {
    }

    private Connection connect() {
        String url = "jdbc:sqlite:BDAlunos.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public boolean pesquisaRegisto(int numero, String nome) {
        String url = "jdbc:sqlite:BDAlunos.db";
        Connection con;
        Statement stmt;
        ResultSet rs = null;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(url);

            String sql = "select * from Alunos where Numero =? AND Nome =?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            // set the corresponding param
            pstmt.setInt(1, numero);
            pstmt.setString(2, nome);
            
            // update 
            rs = pstmt.executeQuery();
            System.out.println("RS: "+(rs.next()));

            pstmt.close();
            con.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return (rs!=null);
    }

    public void update(int oldNumero, int numero, String nome, String curso) {

        String url = "jdbc:sqlite:BDAlunos.db";
        Connection con;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(url);

            String sql = "UPDATE Alunos SET Numero = ? , "
                    + "Nome = ? , "
                    + "Curso = ? "
                    + "WHERE numero = ?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            // set the corresponding param
            pstmt.setInt(1, numero);
            pstmt.setString(2, nome);
            pstmt.setString(3, curso);
            pstmt.setInt(4, oldNumero);
            // update 
            pstmt.executeUpdate();

            pstmt.close();
            con.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void inserirRegisto(int numero, String nome, String curso) {

        String url = "jdbc:sqlite:BDAlunos.db";
        Connection con;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO Alunos "
                    + "VALUES (" + numero + ",'" + nome + "','" + curso + "')");

            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

    }

    public void inserirRegistoPre(int numero, String nome, String curso) {

        String url = "jdbc:sqlite:BDAlunos.db";
        Connection con;
        Statement stmt;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            String sql = "INSERT INTO Alunos VALUES (?,?,?)";

            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, numero);
            pstmt.setString(2, nome);
            pstmt.setString(3, curso);

            pstmt.executeUpdate();
            

            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }

    }

    
    public void lerTabela(JTable tabela) {
        String url = "jdbc:sqlite:BDAlunos.db";
        Connection con;
        Statement stmt;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            String nomeTabela = "Alunos";
            ResultSet rs = stmt.executeQuery("select * from " + nomeTabela);
            int numCols = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                Object[] dados = {
                    rs.getInt("Numero"),
                    rs.getString("Nome"),
                    rs.getString("Curso")
                };
                modelo.addRow(dados);
            }
            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void lerTabelaModelo(JTable tabela, String [] campos) {
        String url = "jdbc:sqlite:BDAlunos.db";
        Connection con;
        Statement stmt;
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        int colCount = campos.length;
        modelo.setColumnCount(colCount);
        modelo.setColumnIdentifiers(campos);
        tabela.setModel(modelo);
        

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }

        try {
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            String nomeTabela = "Alunos";
            ResultSet rs = stmt.executeQuery("select * from " + nomeTabela);
            
            while (rs.next()) {
                Object[] record = new String[colCount];
                for (int i = 0; i < colCount; i++) {
                    record[i] = rs.getString(campos[i]);
                }
                modelo.addRow(record);
            }
            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
    
}

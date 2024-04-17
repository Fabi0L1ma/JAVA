package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection ConexaoBd() {

        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost/BANCO1?user=root&password=";
            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Classe Conexão " + e);
        }

        return conn;
    }
}

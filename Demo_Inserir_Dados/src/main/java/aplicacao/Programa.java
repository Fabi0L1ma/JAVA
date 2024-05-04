
package aplicacao;

import Conexao.DB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {

    public static void main(String[] args) {
        
        Connection conn = null;
        PreparedStatement st = null;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            conn = new DB().conexao();
            
            st = conn.prepareStatement("INSERT INTO VENDEDOR"
                    + "(NOME, EMAIL, DATA_NASCIMENTO, SALARIO, ID_DEPARTAMENTO)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            
            st.setString(1, "Maria Black"); // O VALOR É A POSIÇÃO DE ? NO COMANDO ACIMA 
            st.setString(2, "maria_black@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
            st.setDouble(4, 3000.00);
            st.setInt(5, 4);
            
            int linhasAlteradas = st.executeUpdate();
            
            // MOSTRA O ID DOS DADOS INSERIDOS
            if(linhasAlteradas > 0){ 
                ResultSet rs = st.getGeneratedKeys();
                
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Pronto! ID: " + id);
                }
                
            }else{
                System.out.println("Nenhuma Linha Foi Alterada!");
            }
            
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            
        }catch(ParseException e){
            System.out.println("Erro: " + e.getMessage());
            
        }finally{
            DB.fecharPS(st);
            DB.fecharConexao();
        }
    }
}

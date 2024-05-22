package DAO;

import DTO.JogadorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JogadorDAO {
    
    Connection conn = null;
    PreparedStatement pst = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void inserir(JogadorDTO jogador){
        conn = new BD().conexaoBD();
        String sql = "INSERT INTO JOGADOR(NUMERO_CAMISA, NOME, POSICAO, CLUBE) VALUES(?, ?, ?, ?)";
        
        try{
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, jogador.getNumCamisa());
            pst.setString(2, jogador.getNome());
            pst.setString(3, jogador.getPosicao());
            pst.setString(4, jogador.getClube());
            
            pst.executeUpdate();
            
            System.out.println("INSERIDO COM SUCESSO!\n");
            
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            
        }finally{
            BD.fecharPS(pst);
            BD.fecharConexao();
        }
    }
    
    public void ler(){
        conn = new BD().conexaoBD();
        String sql = "SELECT * FROM JOGADOR";
        
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                System.out.println(rs.getInt("NUMERO_CAMISA") + ", " + rs.getString("NOME") + ", " +
                        rs.getString("POSICAO") + ", " + rs.getString("CLUBE"));
            }
            
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            
        }finally{
            BD.fecharRS(rs);
            BD.fecharST(st);
            BD.fecharConexao();
        }
    }
    
    public void alterar(String novoClube, int id){
        conn = new BD().conexaoBD();
        String sql = "UPDATE JOGADOR SET CLUBE = ? WHERE NUMERO_CAMISA = ?";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, novoClube);
            pst.setInt(2, id);
            
            pst.executeUpdate();
            
            System.out.println("ALTERADO COM SUCESSO!");
            
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            
        }finally{
            BD.fecharPS(pst);
            BD.fecharConexao();
        }
    }
    
    public void deletar(int id){
        conn = new BD().conexaoBD();
        String sql = "DELETE FROM JOGADOR WHERE NUMERO_CAMISA = ?";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);   
            pst.execute();
            
            System.out.println("DELETADO COM SUCESSO!");
            
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
            
        }finally{
            BD.fecharPS(pst);
            BD.fecharConexao();
        }   
    }
      
}

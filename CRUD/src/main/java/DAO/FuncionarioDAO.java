package DAO;

import DTO.FuncionarioDTO;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarFuncionario(FuncionarioDTO funcionariodto) {

        String sql = "INSERT INTO TABELA(NOME, CIDADE) VALUES(?, ?)";
        conn = new Conexao().ConexaoBd();
        
        try{
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, funcionariodto.getNome());
            pstm.setString(2, funcionariodto.getCidade());
            pstm.execute();
            
            pstm.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Classe Funcionario DTO! " + e);
  
        }
    }
    
    public List<FuncionarioDTO> ler(){
        
        conn = new Conexao().ConexaoBd();
        String sql = "SELECT * FROM TABELA";
        ResultSet rs = null;
        
        List<FuncionarioDTO> funcionarios = new ArrayList<>();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                FuncionarioDTO funcionariodto = new FuncionarioDTO();
                
                funcionariodto.setId(rs.getInt("ID"));
                funcionariodto.setNome(rs.getNString("NOME"));
                funcionariodto.setCidade(rs.getNString("CIDADE"));
                funcionarios.add(funcionariodto);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Classe Funcionario DTO! " + e);
        }
        
        return funcionarios;  
    }
    
    public void deletarFuncionario(FuncionarioDTO funcionariodto){
        
   
        String sql = "DELETE FROM TABELA WHERE ID = ?";
        conn = new Conexao().ConexaoBd();
        
       try{
            pstm = conn.prepareStatement(sql);
            
           
            pstm.setInt(1, funcionariodto.getId());
            pstm.execute();
            
            pstm.close();
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Classe Funcionario DTO! " + e);
       }
        
    }
    
    public  void alterar(FuncionarioDTO funcionariodto){
        
        String sql = "UPDATE TABELA SET NOME = ?, CIDADE = ?  WHERE ID = ?";
        conn = new Conexao().ConexaoBd();
        
       try{
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(3, funcionariodto.getId());
            pstm.setString(1, funcionariodto.getNome());
            pstm.setString(2, funcionariodto.getCidade());
            pstm.execute();
            
            pstm.close();
            
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Classe Funcionario DTO! " + e);
       }
        
    }

}

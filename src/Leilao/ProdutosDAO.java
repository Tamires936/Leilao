package Leilao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tamires
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet rs;
    
    ArrayList<ProdutosDTO> lista = new ArrayList<>();
    
    public boolean connectDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/leiloes_tdsat","root", "826390T98#10t11");
            return true;
           
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }

    public int cadastrar(ProdutosDTO produtos){
        int status;
        try {
            prep = conn.prepareStatement("INSERT INTO produtos VALUES(?,?,?,?)");
            prep.setString(1,produtos.getId());
            prep.setString(2,produtos.getNome());
            prep.setDouble(3,produtos.getValor());
            prep.setString(4,produtos.getStatus());
            status = prep.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
        
    }
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            
        }
    }

    public ProdutosDTO listarProdutos(){
        ProdutosDTO produto = new ProdutosDTO();
        
         
            try{
                prep = conn.prepareStatement("SELECT * FROM produtos");

                rs = prep.executeQuery();
                if(rs.next()){
                    produto.setId(rs.getString("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setValor(rs.getInt("valor"));
                    produto.setStatus(rs.getString("status"));
                    return produto;
                }
                else{
                    return null;
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Algo deu errado "+ex.getMessage());
                return null;
            }
            
    
     }
  }
        
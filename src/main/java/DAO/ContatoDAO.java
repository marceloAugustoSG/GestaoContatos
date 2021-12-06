package DAO;

import com.pss.gestaocontatos.model.Contato;
import connection.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContatoDAO extends Conexao {

    public boolean create(Contato contato) {
        conectar();
        String sql = "INSERT INTO Contato("
                + "nome,telefone)"
                + ""
                + "VALUES(?,?)";
        PreparedStatement stmt = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTelefone());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        return true;
    }

    public List<Contato> getContatos() {

        List<Contato> listaContatos = new ArrayList<>();
        Contato contato = new Contato();
        conectar();

        ResultSet rs = null;
        PreparedStatement stmt = null;

        String sql = "SELECT nome,telefone FROM Contato";
        try {
            stmt = criarPreparedStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                contato = new Contato();
                contato.setNome(rs.getString(1));
                contato.setTelefone(rs.getString(2));
                listaContatos.add(contato);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        desconectar();
        return listaContatos;
    }

    public boolean delete(int codContato) {

        conectar();
        PreparedStatement stmt;
        String sql = "DELETE FROM Contato WHERE pkIdContato ='" + codContato + "'";
        stmt = this.criarPreparedStatement(sql);
        try {
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        this.desconectar();
        return true;
    }

}

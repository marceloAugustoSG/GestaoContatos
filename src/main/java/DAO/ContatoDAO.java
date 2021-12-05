package DAO;

import com.pss.gestaocontatos.model.Contato;
import connection.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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

}

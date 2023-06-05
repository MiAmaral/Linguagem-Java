package Cadastros;

import java.util.ArrayList;
import java.util.List;

public class PessoasDao extends Dao {
	
	public void incluirPessoa(Pessoas p) throws Exception {
		open();
		stmt = conn.prepareStatement("insert into pessoas values(?,?,?)");
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3, p.getEmail());
		stmt.execute();
		stmt.close();
		close();
	}

	
	public void alterarPessoa(Pessoas p) throws Exception {
		open();
		stmt = conn.prepareStatement("update Pessoas set nomepessoa = ?, email = ? where idPessoa = ?");
		stmt.setString(1, p.getNomePessoa());
		stmt.setString(2, p.getEmail());
		stmt.setInt(3, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();
	}

	public void excluirPessoa(Pessoas p) throws Exception {

		open();
		stmt = conn.prepareStatement("delete from Pessoas where idPessoa = ?");
		stmt.setInt(1, p.getIdPessoa());
		stmt.execute();
		stmt.close();
		close();

	}
	// etornando um objeto
	public Pessoas consultarPessoaIndividual(int cod) throws Exception {
			open();
			stmt = conn.prepareStatement("select * from pessoas where idPessoa = ? ");
			stmt.setInt(1, cod);
			rs = stmt.executeQuery();			
			Pessoas p = null;
			if (rs != null) {
				if (rs.next()) {
					p = new Pessoas();
					p.setIdPessoa(rs.getInt("idPessoa"));
					p.setNomePessoa(rs.getString("nomePessoa"));
					p.setEmail(rs.getString("email"));				
				}
			}else {
				System.out.println("Registro não encontrado");
			}
			close();
			return p;
	}

	public List<Pessoas> ListarPessoas() {
		try {
			open();
			stmt = conn.prepareStatement("select * from pessoas   ");
			rs = stmt.executeQuery();
	        List<Pessoas> listaPessoas = new ArrayList<>();
			while (rs.next()) {
				Pessoas p = new Pessoas();
				p.setIdPessoa(rs.getInt("idPessoa"));
				p.setNomePessoa(rs.getString("nomePessoa"));
				p.setEmail(rs.getString("email"));
				listaPessoas.add(p);
			}
			close();
			return listaPessoas;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
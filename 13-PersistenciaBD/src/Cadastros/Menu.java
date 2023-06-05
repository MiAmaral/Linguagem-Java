package Cadastros;

import java.util.List;

public class Menu {

	public static void main(String[] args) {
		PessoasDao pessoasDao = new PessoasDao();
		
		try {
//			//**Incluir uma pessoa**
//			Pessoas pessoa1 = new Pessoas(1, "Lucas","lucas@email.com");
//			Pessoas pessoa2 = new Pessoas(2,"Alex","alex@email.com");
//			pessoasDao.incluirPessoa(pessoa1);
//			pessoasDao.incluirPessoa(pessoa2);
			
			
			//**Alterar uma pessoa**
			try {
				
				Pessoas ps = pessoasDao.consultarPessoaIndividual(2);
				if(ps != null) {
					ps.setEmail("alex@email.com");
					pessoasDao.alterarPessoa(ps);
				}else {
					System.out.println("Pessoa não encontrada");
				}
				
			} catch (Exception ex ){
				
		        System.out.println("Alguma coisa deu errado no acesso ao banco de dados.");
			}
			
			
			//**Listando todas as pessoas**
			List<Pessoas> listaPessoas = pessoasDao.ListarPessoas();
			for (Pessoas p: listaPessoas) {
				System.out.println("Id.: " + p.getIdPessoa());
				System.out.println("Nome : "  +p.getNomePessoa());
				System.out.println("Email : " +p.getEmail());
			}
			
			
//			//**Excluir uma pessoa**
//			Pessoas pes = pessoasDao.consultarPessoaIndividual(1);
//			pessoasDao.excluirPessoa(pes);
//			
//			
		}catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}

}

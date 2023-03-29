package servicos;

import java.util.Date;

import entidades.Filme;
import entidades.Locacao;
import entidades.Usuario;
import utilities.DateUtil;

public class LocacaoService {
	public Locacao alugarFilme(Usuario usuario, Filme filme) {
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());
		
		Date dataEntrega = new Date();
		dataEntrega = DateUtil.adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		return locacao;
	}

}

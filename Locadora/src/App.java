
import java.util.Date;
/*import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;*/

import entidades.Filme;
import entidades.Locacao;
import entidades.Usuario;
import servicos.LocacaoService;
import utilities.DateUtil;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("olá, sou um programa de louca");
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Gabrille"+ "");
		Filme filme = new Filme("ACAB", 7, 5.0);
		
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		System.out.println(locacao.getValor() == 5.0);
		System.out.println(DateUtil.isMesmaData(locacao.getDataLocacao(), new Date()));
		System.out.println(DateUtil.isMesmaData(locacao.getDataRetorno(), DateUtil.obterDataComDiferencaDias(2)));
}
}
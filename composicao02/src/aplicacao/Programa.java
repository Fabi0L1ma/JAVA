package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entidades.Comentario;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		
		Comentario c1 = new Comentario("Boa viagem!");
		Comentario c2 = new Comentario("Wow que incrivel!");
		
		Post p1 = new Post(fmt.parse("21/06/2018 18:05:44"), "Viajar para a Nova Zelândia",
										"I'm going to visit this wonderful country!", 12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite");
		Comentario c4 = new Comentario("Que a força esteja com você");
		
		Post p2 = new Post(fmt.parse("28/07/2018 23:14:19"), "Boa noite galera", "See you tomorrow", 5);
		
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1 + "\n");
		System.out.println(p2);
		

	}

}

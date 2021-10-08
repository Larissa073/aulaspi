package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	//@PostMapping("/eventos")//
	//public String test(String nome,String local,String data,String horario) {
		//System.out.println("O nome: "+ nome);
		//System.out.println("O local: "+ local);
		//System.out.println("A data: "+ data);
		//System.out.println("O horario: "+ horario);
		//aqui foi pego um metodo de cada vez e foi mostrado no console o que foi digitado na pagina.//
		//return "evento-test";
	//
	
	//@PostMapping("/eventos")
	//public String test(Evento evento) {
	//	System.out.println(evento.getNome());
	//	System.out.println(evento.getLocal());
	//	System.out.println(evento.getData());
		//System.out.println(evento.getHorario());
		//aqui foi importado o Evento que foi feito antes, pegou e mostrou no console o que foi digitado na pagina toda.//
		//return "evento-test";
	//}
	@PostMapping("/eventos")
	public String test(Evento evento) {
		System.out.println(evento);
		return "evento-test";
	}
	
}

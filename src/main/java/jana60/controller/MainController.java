package jana60.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping

public class MainController {

	
	@GetMapping ("/home")
	public String saluta() {
		return "home";
	}
	
	
	@GetMapping("/ora")
	public String ora(Model model)
	{
		LocalDateTime ora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy, HH:mm");
		String oraFormattata = ora.format(dtf);
		model.addAttribute("ora", oraFormattata);
		return "ora";
	}
	
}

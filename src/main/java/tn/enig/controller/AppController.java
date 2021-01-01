package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tn.enig.dao.ILivreDao;
import tn.enig.model.Livre;

@Controller
public class AppController {
	@Autowired
	ILivreDao dao;

	@GetMapping(value = "/")
	public String get1(Model model) {
		List<Livre> liste = dao.findAll();
		model.addAttribute("liste", liste);
		return "accueil";
	}

	@GetMapping(value = "/addLivre")
	public String get33(Model model) {
		Livre lv = new Livre();
		model.addAttribute("lv", lv);
		return "formAddLivre";
	}

	@PostMapping(value = "/saveLivre")
	public String get3(Model model, @ModelAttribute("lv") Livre lv) {
		dao.save(lv);
		return "redirect:/";
	}

	@GetMapping(value = "/deleteLivre/{id}")
	public String get4(Model model, @PathVariable("id") int id) {
		dao.deleteById(id);
		return "redirect:/";
	}

	@GetMapping(value = "/Page404")
	public String get55(Model model) {
		return "404";
	}

}

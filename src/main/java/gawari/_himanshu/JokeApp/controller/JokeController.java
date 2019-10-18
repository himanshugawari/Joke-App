package gawari._himanshu.JokeApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gawari._himanshu.JokeApp.service.JokeService;

@Controller
public class JokeController {

	private JokeService jokeService;

	@Autowired
	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}

	@RequestMapping({ "/", "" })
	public String displayJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";
	}

}

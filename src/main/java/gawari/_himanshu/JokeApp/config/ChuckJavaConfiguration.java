package gawari._himanshu.JokeApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//Java Based Configuration example remove for spring boot version
//Also added a constructor to JokeServiceImpl remove that also
@Configuration
public class ChuckJavaConfiguration {
	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

}

package gawari._himanshu.JokeApp.config;

import org.springframework.context.annotation.Bean;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//Java Based Configuration added @Configuration & @Bean example remove for spring boot version
//Also added a constructor to JokeServiceImpl remove that also

//comment @Configuration for xml based cofiguration added chuck-config.xml file
//@Configuration
public class ChuckJavaConfiguration {
	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

}

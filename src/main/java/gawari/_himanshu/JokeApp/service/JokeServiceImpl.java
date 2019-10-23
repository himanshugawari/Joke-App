package gawari._himanshu.JokeApp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	// Uncomment for normal Spring Boot version
	/*
	 * public JokeServiceImpl() { super(); this.chuckNorrisQuotes = new
	 * ChuckNorrisQuotes(); }
	 */

	// Java Configuration Based Version
	// Constructor based implementation
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return this.chuckNorrisQuotes.getRandomQuote();
	}

}

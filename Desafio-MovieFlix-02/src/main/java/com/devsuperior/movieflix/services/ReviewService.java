package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.repositories.GenreRepository;

@Service
public class ReviewService  {


	@Autowired
	private GenreRepository genreRepository;

	
	


}

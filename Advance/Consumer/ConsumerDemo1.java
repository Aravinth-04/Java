package com.consumerInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie
{
	String hero;
	String heroine;
	String movie_name;
	public Movie(String hero, String heroine, String movie_name) 
	{
		this.hero = hero;
		this.heroine = heroine;
		this.movie_name = movie_name;
	}
	
}
public class ConsumerDemo1 {

	public static void main(String[] args) {
	ArrayList<Movie> movies=new ArrayList<>();	
	movies.add(new Movie("Vijay","karina","beast"));
	movies.add(new Movie("vijayseathupathi","samatha","222"));
	movies.add(new Movie("Pradeepkumar","unknown","LoveToday"));
	
	Consumer<Movie> c=s->{
		System.out.println("Hero name: "+s.hero);
		System.out.println("Heroine name: "+s.heroine);
		System.out.println("movie name: "+s.movie_name);
	};
	for(Movie movie:movies)
	{
		c.accept(movie);
	}

	}

}

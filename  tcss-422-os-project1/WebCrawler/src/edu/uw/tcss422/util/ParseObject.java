package edu.uw.tcss422.util;

import java.util.ArrayList;
import java.util.Collection;

import org.jsoup.select.Elements;

public class ParseObject {
	
	  /**
	   * A collection of URLs parsed from the page by the PageRetriver.
	   */
	  private Elements links;
	  
	  /**
	   * The total parsing time for this parse.
	   */
	  private long parseTime;

	  /**
	   * 	A collection of words parsed from the page by the PageRetriver.
	   */
	  private Collection<String> words = new ArrayList<String>();
	  
	  /**
	   * Constructor for ParseObject
	   * @param words the list of words parsed from the page.
	   * @param links the list of links parsed from the page.
	   */
	  public ParseObject(Collection<String> words, Elements links) {
		  this.words = words;
		  this.links = links;
	  }
	  
	  /**
	   * Gets all links stored for this page.
	   * @return a list of links
	   */
	  public Elements getLinks() {
		  return links;
	  }

	  /**
	   * Gets all words stored for this page.
	   * @return a list of words
	   */
	  public Collection<String> getWords() {
		  return words;
	  }
	  
	  /**
	   * Sets the total parsing time for this page in milliseconds.
	   * @param time the parse time in milliseconds.
	   */
	  public void setParseTime(long time) {
		  parseTime = time;
	  }
	  
	  /**
	   * Gets the total parsing time for this page in milliseconds.
	   * @return the parse time in milliseconds.
	   */
	  public long getParseTime() {
		  return parseTime;
	  }
	  
}

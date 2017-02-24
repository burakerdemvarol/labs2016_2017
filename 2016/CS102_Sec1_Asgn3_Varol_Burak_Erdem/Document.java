//**********************************************************
//Document.java                    Author: Burak Erdem Varol
//
//Lab03                            Date: 24.10.2016
//**********************************************************

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Document Class
 * Methods and variables defining and implementing
 */
public class Document {
  
  private String fileName;
  private Term[] wordFrequency;
  private int wordFrequencyCount;
  private static final int MAXIMUM_NO_OF_TERMS = 10000;
  
  public Document( String fileName) {
    
    this.fileName = fileName;
    this.wordFrequency = new Term[ MAXIMUM_NO_OF_TERMS];
    wordFrequencyCount = 0;
  }
  /**
   * contains method
   * @param String
   * return boolean
   */
  public boolean contains( String word) {
    
    if( getTerm(word) == null)
      return false;
    
    return true;
  }
  /**
   * getTerm method
   * @param String
   * return null
   */
  private Term getTerm( String word) {
    
    for( int i = 0; i < wordFrequencyCount; i++)
      if( wordFrequency[i].getWord().equals( word))
      return wordFrequency[i];
    
    return null;
  }
  /**
   * processDocument : processing and analyzing document
   */
  public void processDocument() {
    
    Scanner scanner;
    /**
     * Getting file name and processing line and symbols replace with space
     */
    try {
      
      scanner = new Scanner( new File( fileName));
      
      while( scanner.hasNextLine()) {
        
        String line = scanner.nextLine();
        line = line.replace( ',',' ');
        line = line.replace( '.',' ');
        line = line.replace( '"',' ');
        line = line.replace( "  ", " ");
        line = line.toLowerCase();
        String[] words = line.split( " ");
        
        for( int i = 0; i < words.length; i++) {
          
          Term term = getTerm( words[i]);
          
          if( term == null) {
            
            term = new Term( words[i]);
            wordFrequency[wordFrequencyCount] = term;
            wordFrequencyCount++;
          }
          term.incrementCount();
        }
      }
    }
    /**
     * if program can not find file output Error fileis not found
     */
    catch ( FileNotFoundException kez) {
      
      System.out.println( " Error: File is not found!!! ");
      kez.printStackTrace();
    }
  }
  /**
   * getCount method
   * @param String
   * return int
   */
  public int getCount( String word) {
    
    Term term = getTerm( word);
    
    if( term != null)
      return term.getCount();
    
    return 0;
  }
  /**
   * getFrequency
   * @param String
   * return double
   */
  public double getFrequency( String word) {
    
    Term term = getTerm( word);
    
    if( term == null)
      return 0;
    
    int wordCount = term.getCount();
    
    double totalCount = 0;
    for( int i = 0; i < wordFrequencyCount; i++) {
      
      totalCount += wordFrequency[i].getCount();
    }
    
    return ((double)wordCount) / totalCount;
  }
  /**
   * getMostFrequentTerm
   * return object
   */
  public Term getMostFrequentTerm() {
    
    if( wordFrequencyCount <= 0)
      return null;
    
    Term retval = wordFrequency[0];
    int max = retval.getCount();
    
    for( int i = 1; i < wordFrequencyCount; i++) {
      
      if( wordFrequency[i].getCount() > max) {
        
        retval = wordFrequency[i];
        max = retval.getCount();
      }
    }
    
    return retval;
  }
  /**
   * getFilename
   * return String
   */
  public String getFilename() {
    
    return fileName;
  }
  /**
   * setFilename
   * @param String
   * return null
   */
  public void setFilename(String fileName) {
    
    this.fileName = fileName;
  }
  /**
   * getWordFrequency
   * @param null
   * return Object
   */
  public Term[] getWordFrequency() {
    
    return wordFrequency;
  }
  /**
   * setWordFrequency
   * @param Term[]
   * return null
   */
  public void setWordFrequency(Term[] wordFrequency) {
    
    this.wordFrequency = wordFrequency;
  }
}

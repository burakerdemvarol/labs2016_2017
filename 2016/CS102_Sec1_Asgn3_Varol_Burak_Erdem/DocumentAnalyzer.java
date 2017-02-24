//**********************************************************
//DocumentAnalyzer.java            Author: Burak Erdem Varol
//
//Lab03                            Date: 24.10.2016
//**********************************************************

import java.util.Scanner;

public class DocumentAnalyzer {
  /**
   * calculateTfidf method
   * @param Document[], Document, String
   * return double
   */
  public static double calculateTfidf( Document[] docs, Document doc, String word) {
    
    double tf = doc.getFrequency(word);
    
    int numberOfDocumentsIncludingWord = 0;
    for( int i = 0; i < docs.length; i++) {
      
      if( docs[i].contains(word))
        numberOfDocumentsIncludingWord++;
    }
    
    if( numberOfDocumentsIncludingWord == 0)
      return 0;
    
    double idf = Math.log( ((double) docs.length) / numberOfDocumentsIncludingWord);
    
    return tf * idf;
  }
  /**
   * Main class
   */
  public static void main( String[] args) {
    /**
     * variables
     * Scanner Defining
     */
    int numberOfDocuments;
    Scanner scanner = new Scanner( System.in);
    Document[] documentArray;
    
    System.out.println( "Enter the number of documents: ");
    numberOfDocuments = scanner.nextInt();
    scanner.nextLine();
    
    documentArray = new Document[numberOfDocuments];
    
    for( int i = 0; i < numberOfDocuments; i++) {
      
      System.out.println( "Enter the name of the document " + (i+1) + " :");
      
      documentArray[i] = new Document( scanner.nextLine());
      documentArray[i].processDocument();
    }
    /**
     *Option Panel
     */
    int option;
    do {
      
      System.out.println( "Enter an option: ");
      System.out.println( "1 - Show frequency of word");
      System.out.println( "2 - Most frequent word in text");
      System.out.println( "3 - Gives tf-idf for all document");
      System.out.println( "4 - Close Program");
      
      option = scanner.nextInt();
      /**
       * Option 1 : Finding word frequency and printing
       */
      if( option == 1) {
        
        System.out.println( "Enter the word which you want to find the frequency:");
        String word = scanner.next();
        word = word.toLowerCase();
        
        for( int i = 0; i < numberOfDocuments; i++) {
          
          System.out.println( "Document " + (i+1));
          System.out.println( "Word: " + word);
          System.out.println( "Term Frequency: " + documentArray[i].getFrequency(word));
        }
      }
      /**
       * Option 2 : finding most frequent word in texts and printing
       */
      else if( option == 2) {
        
        for( int i = 0; i < numberOfDocuments; i++) {
          
          Term term = documentArray[i].getMostFrequentTerm();
          System.out.println( "Document " + (i+1));
          System.out.println( "Word: " + term.getWord());
          System.out.println( "Number of Appearance: " + term.getCount());
        }
      }
      /**
       * Option 3 : Entering word and calculate tf-idf and printing 
       */
      else if( option == 3) {
        
        System.out.println( "Enter the word which you want to calculate tf-idf:");
        String word = scanner.next();
        
        for( int i = 0; i < numberOfDocuments; i++) {
          
          System.out.println( "Document " + (i+1));
          System.out.println( "Word: " + word);
          System.out.println( "Tf-Idf: " + calculateTfidf(documentArray, documentArray[i], word));
        }
      }
      /**
       * Option 4 : close application
       */
      else if( option != 4) {
        
        System.out.println( "Wrong Input! Please give between 1 and 4 ");
      }
      
    } while( option != 4);
    
  }
}

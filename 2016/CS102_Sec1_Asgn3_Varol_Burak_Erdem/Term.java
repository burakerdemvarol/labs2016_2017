//**********************************************************
//Term.java                        Author: Burak Erdem Varol
//
//Lab03                            Date: 24.10.2016
//**********************************************************

public class Term {
  /**
   * Variables
   */
  private String word;
  private int count;
  /**
   * Term
   * @param string word
   */
  public Term( String word) {
    
    this.word = word;
    this.count = 0;
  }
  /**
   * incrementCount
   * @param null
   * return 1 or 0
   */
  public void incrementCount() {
    
    count += 1;
  }
  /**
   * getWord
   * @param null
   * return String
   */
  public String getWord() {
    
    return word;
  }
  /**
   * setWord
   * @param  String
   */
  public void setWord(String word) {
    
    this.word = word;
  }
  /**
   * getCount
   * @param null
   * return int
   */
  public int getCount() {
    
    return count;
  }
  /**
   * setCount
   * @param int
   */
  public void setCount(int count) {
    
    this.count = count;
  }
}

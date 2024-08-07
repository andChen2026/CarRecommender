package org.Searching;

/*
 A Naive Autocompleter Engine - Uses a DLB as the backing data structure
 @author Andrew Chen
 */
public class AutoCompleterEngine {
    DLB<Boolean> dict;
    DLB<Boolean> uh;
    StringBuilder cWord;

    public AutoCompleterEngine(DLB<Boolean> dict, DLB<Boolean> uh)
    {

    }

    public void updateWord(StringBuilder cWord)
    {
        this.cWord = cWord;
    }

    
    private boolean isValid() // Check if the current word is a valid prefix to a word or a valid word
    {
        return false;
    }


}

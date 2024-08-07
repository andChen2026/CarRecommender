package org.Searching;

/*
 A Naive AutoCorrector Engine - Uses a DLB as the backing data structure
 @author Andrew Chen
 */
public class AutoCorrectorEngine {

    DLB<Boolean> dict; // Global Dictionary of words
    DLB<Boolean> uh; // History of all words the client has searched for
    StringBuilder cWord; // Current word the client is searching for

    public AutoCorrectorEngine(DLB<Boolean> dict, DLB<Boolean> uh)
    {
        this.dict = dict;
        this.uh = uh;
    }

    public void updateWord(StringBuilder cWord)
    {
        this.cWord = cWord;
    }

    public void correct() // Corrects the string 
    {

    }

    public void suggest() // Suggests up to 5 strings based on frequency
    {

    }

    public void ignore() // ignores the suggestions
    {

    }

    private boolean isValid() // Check if the current word is a valid prefix to a word or a valid word
    {
        return false;
    }

    private void addToDict() // If user ignores the correction suggestions, then add it to the dict and don't prompt again
    {

    }
}

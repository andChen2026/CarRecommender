package org.Searching;

import org.Tools.DLB;

/*
 Class to allow users to search for words
 Utilizes both Autocompleter & Autocorrector engines
 API to allow for user interaction between the two databases
 */
public class SearchEngine {

    AutoCompleterEngine autocompleter; // Autocompleter engine
    AutoCorrectorEngine autocorrector; // Autocorrector engine

    DLB<Integer> uh; // UserHistory, stores frequencies 
    DLB<Integer> dict; // Dictionary, stores words

    StringBuilder cSearch; // current search state

    public SearchEngine(String dictName) // load the dictionary into memory
    {
        
    }

    public SearchEngine(String dictName, String uhName) // Load the dictionary & userHistory into memory
    {

    }

    public void addChar(char letter) // add a letter to the end of the current search
    {

    }

    public void addString(String s) // add a string to the end of the current search
    {

    }
}

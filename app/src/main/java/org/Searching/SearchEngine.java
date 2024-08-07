package org.Searching;

/*
 Class to allow users to search for words
 Utilizes both Autocompleter & Autocorrector engines
 API to allow for user interaction between the two databases
 */
public class SearchEngine {

    AutoCompleterEngine acompleter; // Autocompleter engine
    AutoCorrectorEngine acorrector; // Autocorrector engine

    DLB<Boolean> uh; // UserHistory
    DLB<Boolean> dict; // Dictionary

    public SearchEngine(String fileName)
    {
        
    }
}

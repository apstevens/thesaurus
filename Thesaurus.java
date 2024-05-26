
import java.util.HashMap;
import java.util.HashSet;

/**
 * Thesaurus takes a word and provides an alternative to that word.
 * This will help find a word or words to aptly express an idea. 
 *
 * @author Andrew Stevens
 * @date 10/01/2022
 * @version 1.0
 */

public class Thesaurus
{
    /**
     * Instance field  
     */
    private HashMap<String, HashSet<String>> synonyms;

    /**
     * Constructor for objects of class Thesaurus.
     * Initialises instance field synonyms.
     */
    public Thesaurus()
    {
        synonyms = new HashMap<>();
    }
    
    /**
     * Getter method used to return the value of the synonyms attribute
     * @return synonyms.
     */
    public HashMap<String, HashSet<String>> getThesaurus()
    {
        return synonyms;
    }

    /**
     * Method to populate sample key value pairs in the collection.
     */
    public void populate()
    {
        HashSet<String> happySyns = new HashSet<>();
        happySyns.add("joyful");
        happySyns.add("contented");
        happySyns.add("cheerful");
        HashSet<String> angrySyns = new HashSet<>();
        angrySyns.add("annoyed");
        angrySyns.add("vexed");
        synonyms.put("happy", happySyns);
        synonyms.put("angry", angrySyns);
        
    }
    
    /**
     * Prints out the entire thesaurus i the format of, 
     * key followed space, hyphen, space, value.
     */
    public void print()
    {
        for(String i : synonyms.keySet())
        {
            System.out.println(i + " - " + synonyms.get(i));
        }
    }
    
    /**
     * Takes two parameters and checks if a key exists in the collection.
     * If a key exists the set is retrieved a synonym is added to it.
     * Where a key doesn't exist a new collection is created with the word as a key
     * and the synonym added as a value.
     * @param aWord a word to be used as a key
     * @param aSynonym a synonym to be used as a value
     */
    public void addSynonym(String aWord, String aSynonym)
    {
        if(synonyms.containsKey(aWord)){
            synonyms.get(aWord).add(aSynonym);
        }
        else{
            synonyms.put(aWord, new HashSet<String>());
            synonyms.get(aWord).add(aSynonym);
        }
        
    }
    
    /**
     * Takes two parameters and checks if a key exists in the collection.
     * If a key exists the set is retrieved a synonym is added to it.
     * Where a key doesn't exist a new collection is created with the word as a key
     * and the synonym added as a value.
     * @param aWord a word to be used as a key
     * @param aSynonym a synonym to be used as a value
     */
    public void replaceWord(String aWord, String aSentence)
    {
         for(String i : synonyms.get(aWord.toLowerCase())){
                System.out.println(aSentence.replace(aWord, i));
         }
    }
    
    /**
     * A method to cross reference the values of synonyms HashMap
     * iterating through the available synonyms and sets the state 
     * to the referenced values.
     */
    public void crossReference()

    {
        
        HashMap<String, HashSet<String>> referencedValues = synonyms;
        
        synonyms = new HashMap<>();
        
        for(String key : referencedValues.keySet()){
            
            for(String val : referencedValues.get(key)){
                
                addSynonym(key,val);
                addSynonym(val, key);
                
                for(String val2 : referencedValues.get(key)){
                    if( val != val2){
                        addSynonym(val, val2);
                    }
                }
            }
        }       
    }
}

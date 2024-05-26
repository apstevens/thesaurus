# Thesaurus

## Project Overview

The Thesaurus project provides a simple implementation of a thesaurus that takes a word and provides its synonyms. This can help users find alternative words to aptly express an idea. The project features methods to populate the thesaurus, add synonyms, replace words in a sentence, and cross-reference synonyms.

**Author**

Andrew Stevens

**Date**

10/01/2022

**Version**

1.0

### Class Description

**Thesaurus Class**

The **Thesaurus** class contains methods to manage and utilize a collection of words and their synonyms.

**Fields**

**private HashMap<String, HashSet<String>> synonyms**: A HashMap that maps a word (key) to a set of its synonyms (value).

**Constructor**

**public Thesaurus()**: Initializes the synonyms field as an empty HashMap.

**Methods**

**public HashMap<String, HashSet<String>> getThesaurus()**: Returns the synonyms map.

**public void populate()**: Populates the thesaurus with sample key-value pairs. For example, "happy" has synonyms like "joyful", "contented", and "cheerful".

**public void print()**: Prints the entire thesaurus in the format "key - value".

**public void addSynonym(String aWord, String aSynonym)**: Adds a synonym to the thesaurus. If the word exists, it adds the synonym to the existing set; if not, it creates a new set for the word.

**public void replaceWord(String aWord, String aSentence)**: Replaces a word in a sentence with each of its synonyms and prints the results.

**public void crossReference()**: Cross-references the synonyms, ensuring that all synonym relationships are bidirectional.

### Usage
To use the **Thesaurus** class, create an instance of the class and call the desired methods. Below are examples demonstrating how to use the class.

#### Example: Populate and Print
```
public class Main {
    public static void main(String[] args) {
        Thesaurus thesaurus = new Thesaurus();
        thesaurus.populate();
        thesaurus.print();
    }
}
```

#### Example: Add Synonym

```
public class Main {
    public static void main(String[] args) {
        Thesaurus thesaurus = new Thesaurus();
        thesaurus.populate();
        thesaurus.addSynonym("happy", "elated");
        thesaurus.print();
    }
}
```

#### Example Replace Word in a Sentence
```
public class Main {
    public static void main(String[] args) {
        Thesaurus thesaurus = new Thesaurus();
        thesaurus.populate();
        thesaurus.replaceWord("happy", "I am very happy today.");
    }
}
```

#### Example Cross-Reference Synonyms
```
public class Main {
    public static void main(String[] args) {
        Thesaurus thesaurus = new Thesaurus();
        thesaurus.populate();
        thesaurus.crossReference();
        thesaurus.print();
    }
}
```

This project provides a foundation for building a more complex thesaurus application, demonstrating key concepts such as data structures, string manipulation, and basic algorithm design in Java.
 

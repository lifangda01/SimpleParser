# SimpleParser
Parse a simple sentence.
1. Compile the grammar file
```
make clean
make
```
2. Print the parse tree
```
java DumpTree < sample.txt
```

Parse Tree generated for the sentence "I like time." is
```
Start
 InputText
  Sentence
   NounPhrase
    Pronoun : I
   VerbPhrase
    Verb : like
    NounPhrase
     CompoundNoun
      Noun : time
```
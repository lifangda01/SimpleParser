# SimpleParser
1. Compile the grammar file
```
make clean
make
```
2. Print the parse tree
```
java DumpTree < sample.txt
```

Parse Tree generated for the sentence "Time flies like an arrow." is
```
Sentence
 NounPhrase
  CompoundNoun
   Noun : Time
   Noun : flies
 VerbPhrase
  Verb : like
  NounPhrase
   Determiner : an
   CompoundNoun
    Noun : arrow
```
#!/usr/bin/python
import re

insertText = """ 
  String lexem = "";

  public void setLexem( String lex ) { lexem = lex; }
  public String getLexem() { return lexem; }

"""

oldText = r'return prefix \+ toString\(\)\;'
newText = """
    if (lexem != "") { return prefix + toString() + " : " + lexem; } 
    else { return prefix + toString(); }
"""

fileName = "SimpleNode.java"

with open(fileName, "r+") as f:
	fileText = f.read()
	# Modify toString()
	fileText = re.sub(oldText, newText, fileText)
	# Insert lexem methods
	fileText = re.sub("(}[^}]+$)", insertText + "\\1", fileText)
	# Overwrite original file
	f.seek(0)
	f.write(fileText)
	f.truncate()
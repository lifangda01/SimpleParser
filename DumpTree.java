/* DumpTree.java */

class DumpTree {

 	public static void main(String args[]) {
  
	/*
	  Create a parser which reads from standard input
	*/
	Parser parser = new Parser(System.in);
	
	try {
	
	  	/*
			Start parsing from the nonterminal "Start".
	  	*/
		SimpleNode parseTree = parser.Start();
	  
	  /*
		If parsing completed without exceptions, print the resulting
		parse tree on standard output.
	  */
		parseTree.dump("");
	  
	} catch (Exception e) {

		/*
		An exception occurred during parsing.
		Print the error message on standard output.
		*/
		System.out.println("---------------------------");
		System.out.println("Sorry, couldn't parse that.");
		System.out.println(e.getMessage());
		System.out.println("---------------------------");

		/*
		Print the call stack 
		*/
		System.out.println("Call stack:");
		e.printStackTrace();
		System.out.println("---------------------------");
	}
} 
}

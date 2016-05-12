package com.homework.console;

import com.homework.analyzer.Analyzer;
import com.homework.analyzer.AnalyzerImp;
import com.homework.parts.Text;

public class Console {

    public static void main(String[] args) {	
	String t = "Resizable-array implementation of the <tt>List</tt> interface.  Implements"
		+ "  all optional list operations, and permits all elements, including"
		+ " <tt>null</tt>.  In addition to implementing the <tt>List</tt> interface,"
             + " this class provides methods to manipulate the size of the array that is"
             + " used internally to store the list.  (This class is roughly equivalent to"
             + " <tt>Vector</tt>, except that it is unsynchronized.)"
             + " <p>The <tt>size</tt>, <tt>isEmpty</tt>, <tt>get</tt>, <tt>set</tt>,"
             + " <tt>iterator</tt>, and <tt>listIterator</tt> operations run in constant"
             + " time.  The <tt>add</tt> operation runs in <i>amortized constant time</i>,"
             + " that is, adding n elements requires O(n) time.  All of the other operations"
             + " run in linear time (roughly speaking).  The constant factor is low compared"
             + " to that for the <tt>LinkedList</tt> implementation." 
             + "Sasha 23 pil vodu sivodna. Kapusta krolike."
             + "Palka palka kartka 34 kapusta.";
	Text text = new Text(t);
	text.getTextClassTree();
	System.out.println(text.getFiltrText());
	System.out.println();
	Analyzer analyzer = new AnalyzerImp();
	analyzer.sortSentencesByWordsCount(text).stream().
		forEach((s) -> System.out.println(s.toString()));
    }

}

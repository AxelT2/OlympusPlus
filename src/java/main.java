package java;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.HashMap;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baton
 */
public class main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    try {
        
        CharStream codePointCharStream = CharStreams.fromFileName("olympusTest.olympus");
        olympusLexer lexer = new olympusLexer(codePointCharStream);
        olympusParser parser = new olympusParser(new CommonTokenStream(lexer));
        parser.addParseListener(new olympusCustomListener());

        // Start parsing
        parser.program(); 
    } catch (IOException e) {
        e.printStackTrace();
    }
}
   


}

package eloq;

import java.io.*;
import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import eloq.grammar.*;

/**
 * Created by student on 2016-02-03.
 */
public class RunEloq {
    public static void main(String[] args) throws IOException {
        String infnam;
        if (args.length > 0) {
            infnam = args[0];
        } else {
            System.out.println("Vilken fil vill du köra?");
            Scanner scanner = new Scanner(System.in);
            infnam = scanner.nextLine();
        }
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infnam));
        eloqLexer lexer = new eloqLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        eloqParser parser = new eloqParser(tokens);
        ParseTree tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Interpreter(infnam), tree);
    }

}

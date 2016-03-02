package eloq;

import java.io.*;
import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import eloq.grammar.*;

/**
 * Created by student on 2016-02-03.
 */
public class RunCompiler {
    public static void main(String[] args) throws IOException {
        String infnam, out;
        if (args.length > 0) {
            infnam = args[0];
            out = args[1];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vilken fil vill du köra?");
            infnam = scanner.nextLine();
            System.out.println("Vilken fil vill du spara som?");
            out = scanner.nextLine();
        }

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infnam));
        eloqLexer lexer = new eloqLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        eloqParser parser = new eloqParser(tokens);
        ParseTree tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        Compiler c = new Compiler(infnam, out);
        walker.walk(c, tree);
        c.closeWriter();
    }

}

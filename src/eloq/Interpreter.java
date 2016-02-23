package eloq;

import eloq.grammar.eloqBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by student on 2016-02-03.
 */
public class Interpreter extends eloqBaseListener {
    private final String infnam;

    public Interpreter (String infnam) {
        this.infnam = infnam;
    }


}

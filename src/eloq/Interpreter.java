package eloq;

import eloq.grammar.*;
import org.antlr.v4.runtime.*;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by student on 2016-02-03.
 */
public class Interpreter extends eloqBaseListener {
    private static class Variable { int value; }

    private final String infnam;
    private final Stack<Integer> exprValue = new Stack<>();
    private final HashMap<String, Variable> vars = new HashMap<>();


    public Interpreter (String infnam) {
        this.infnam = infnam;
    }

    private Variable getVar(Token tok) {
        String name = tok.getText();
        Variable v = vars.get(name);
        if (v == null) {
            error(tok.getLine(), "undefined " + name);
            return new Variable();   // avoid null pointer exception
        } else {
            return v;
        }
    }

    private void error(int line, String msg) {
        System.err.println(infnam + ":" + line + ": " + msg);
    }

    @Override
    public void enterDecl (eloqParser.DeclContext ctx) {
        String var = ctx.ID().getText();
        if (vars.containsKey(var)) {

        } else {
            vars.put(var, new Variable());
        }
    }

    @Override
    public void enterAtomExpr(eloqParser.AtomExprContext ctx) {
        if (ctx.ID() != null) {
            exprValue.push(getVar(ctx.ID().getSymbol()).value);
        } else if (ctx.INT() != null) {
            exprValue.push(Integer.parseInt(ctx.INT().getText()));
        }
    }

    @Override
    public void exitAssign(eloqParser.AssignContext ctx) {
        String var = ctx.ID().getText();
        vars.get(var).value = exprValue.pop();
    }

    @Override
    public void exitExpr(eloqParser.ExprContext ctx) {
        if (ctx.expr() != null)
            exprValue.push(exprValue.pop() + exprValue.pop());
    }




}

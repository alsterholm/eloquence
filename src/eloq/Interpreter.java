package eloq;

import eloq.grammar.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by student on 2016-02-03.
 */
public class Interpreter extends eloqBaseListener {
    private static class Variable { int value; }

    private final ParseTreeWalker walker;
    private final String infnam;
    private final Stack<Integer> stack = new Stack<>();
    private final HashMap<String, Variable> vars = new HashMap<>();


    public Interpreter (String infnam) {
        this.infnam = infnam;
        this.walker = new ParseTreeWalker();
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
            stack.push(getVar(ctx.ID().getSymbol()).value);
        } else if (ctx.INT() != null) {
            stack.push(Integer.parseInt(ctx.INT().getText()));
        }
    }

    @Override
    public void exitPrint(eloqParser.PrintContext ctx) {
        System.out.println(stack.pop());
    }

    @Override
    public void exitAddExpr(eloqParser.AddExprContext ctx) {
        stack.push(stack.pop() + stack.pop());
    }

    @Override
    public void exitMulExpr(eloqParser.MulExprContext ctx) {
        stack.push(stack.pop() * stack.pop());
    }

    @Override
    public void exitAssign(eloqParser.AssignContext ctx) {
        String var = ctx.ID().getText();
        vars.get(var).value = stack.pop();
    }

    @Override
    public void enterIntervalLoop(eloqParser.IntervalLoopContext ctx) {
        String var = ctx.ID().getText();

        Variable v = new Variable();
        walker.walk(this, ctx.expr(0));

        v.value = stack.pop();
        vars.put(var, v);
    }

    @Override
    public void exitIntervalLoop(eloqParser.IntervalLoopContext ctx) {
        ParseTree block = ctx.block();

        int max = stack.pop();

        String var = ctx.ID().getText();
        Variable v = vars.get(var);

        for (int i = v.value + 1; i <= max; i++) {
            vars.get(var).value = i;

            walker.walk(this, block);
        }
    }
}

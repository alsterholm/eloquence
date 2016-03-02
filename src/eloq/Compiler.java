package eloq;

import eloq.grammar.eloqBaseListener;
import eloq.grammar.eloqParser;

import java.io.*;

/**
 * Created by andreas on 2016-03-02.
 */
public class Compiler extends eloqBaseListener {
    private String infnam;
    private Writer writer;
    private AsmStack stack;


    public Compiler(String infnam, String filename) {
        this.infnam = infnam;
        this.writer = new Writer(filename);
        this.stack = new AsmStack(writer);
    }

    @Override
    public void exitAssign(eloqParser.AssignContext ctx) {
        String var = ctx.ID().getText();
        writer.assignVariableFromStack(var, stack.getCurrentIndex());
    }

    @Override
    public void enterAtomExpr(eloqParser.AtomExprContext ctx) {
        if (ctx.ID() != null) {
            stack.push(ctx.ID().getText());
        } else if (ctx.INT() != null) {
            stack.push(Integer.parseInt(ctx.INT().getText()));
        }
    }

    @Override
    public void enterIntervalLoop(eloqParser.IntervalLoopContext ctx) {
        String var = ctx.ID().getText();
        int min = Integer.parseInt(ctx.expr(0).getText());
        int max = Integer.parseInt(ctx.expr(1).getText());

        writer.assign(var, min);
        writer.write("(LOOP)");
        writer.load(var);
        writer.write("D=M");
        writer.load(max);
        writer.write("D=D-A");
        writer.load("END");
        writer.write("D;JGT");
    }

    @Override
    public void exitIntervalLoop(eloqParser.IntervalLoopContext ctx) {
        String var = ctx.ID().getText();
        writer.load(var);
        writer.write("M=M+1");
        writer.load("LOOP");
        writer.write("0;JMP");
        writer.write("(END)");
        writer.load("END");
    }

    @Override
    public void exitAddExpr(eloqParser.AddExprContext ctx) {
        stack.pop();
        writer.write("D=M");
        writer.load(String.valueOf(stack.getCurrentIndex()));
        writer.add();
    }

    public void closeWriter() {
        this.writer.close();
    }

    private class AsmStack {
        public int index;
        private Writer writer;

        public AsmStack(Writer writer) {
            this.index = 10000;
            this.writer = writer;
        }

        public void push(int value) {
            writer.assign(String.valueOf(++index), value);
        }

        public void push(String var) {
            writer.assignVariableToStack(var, ++index);
        }

        public void pop() {
            if (index < 10000) {
                System.err.println("Stack is empty, aborting...");
                System.exit(0);
            }

            writer.load(String.valueOf(index--));
        }

        public int getCurrentIndex() {
            return index;
        }
    }

    private class Writer {
        private BufferedWriter writer;

        public Writer(String filename) {
            try {
                this.writer = new BufferedWriter(new FileWriter(new File(filename)));
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }

        public void declare(String var) {
            this.write(String.format("@%s", var));
        }

        public void assign(String var, int value) {
            System.out.println("----ASSIGN----");
            this.write(String.format("@%s", value));
            this.write("D=A");
            this.write(String.format("@%s", var));
            this.write("M=D");
        }

        public void assignVariableToStack(String var, int pos) {
            System.out.println("----ASSIGN FROM MEMORY----");
            this.write(String.format("@%s", var));
            this.write("D=M");
            this.write(String.format("@%s", pos));
            this.write("M=D");
        }

        public void assignVariableFromStack(String var, int pos) {
            System.out.println("----ASSIGN FROM MEMORY----");
            this.write(String.format("@%s", pos));
            this.write("D=M");
            this.write(String.format("@%s", var));
            this.write("M=D");
        }

        public void load(String m) {
            System.out.println("----LOAD----");
            this.write(String.format("@%s", m));
        }

        public void load(int m) {
            this.load(String.valueOf(m));
        }

        public void add() {
            System.out.println("----ADD----");
            this.write("M=D+M");
        }

        public void write(String str) {
            try {
                System.out.println("Writing " + str);
                writer.write(str + "\n");
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }


        public void close() {
            try {
                writer.close();
            } catch (IOException e) {

            }
        }
    }
}

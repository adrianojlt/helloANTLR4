import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import pt.adrz.antlr4.json.MyJsonVisitor;
import pt.adrz.antlr4.csv.CSVLexer;
import pt.adrz.antlr4.csv.CSVParser;
import pt.adrz.antlr4.json.JSONLexer;
import pt.adrz.antlr4.json.JSONParser;

import java.io.FileInputStream;

/**
 * Created by Adrianot on 07/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        //csv();
        json(args);

    }

    public static void json(String[] args) {

        try {

            ANTLRInputStream input = new ANTLRFileStream("input/input.json");
            JSONLexer lexer = new JSONLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JSONParser parser = new JSONParser(tokens);

            ParseTree tree = parser.json();
            MyJsonVisitor visitor = new MyJsonVisitor();
            Object result = visitor.visit(tree);

            //System.out.println(tree.toStringTree());
            System.out.println(result.toString());

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void csv() {

        try {

            FileInputStream input = new FileInputStream("input/input.csv");
            CSVLexer lexer = new CSVLexer(new ANTLRInputStream(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CSVParser parser = new CSVParser(tokens);
            ParserRuleContext ruleContext = parser.file();
            Trees.inspect(ruleContext, parser);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

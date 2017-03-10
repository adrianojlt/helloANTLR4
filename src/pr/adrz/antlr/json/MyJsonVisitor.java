package pr.adrz.antlr.json;

import pt.adrz.antlr4.json.gen.JSONBaseVisitor;
import pt.adrz.antlr4.json.gen.JSONParser;

import java.util.List;

/**
 * Created by Adrianot on 10/03/2017.
 */
public class MyJsonVisitor extends JSONBaseVisitor <String> {
    @Override
    public String visitJson(JSONParser.JsonContext ctx) {
        Object obj = visit(ctx.object());
        StringBuilder sb = new StringBuilder("<wrapper>").append(obj).append("</wrapper>");

        return sb.toString();
        //return super.visitJson(ctx);
    }

    @Override
    public String visitArraynotempty(JSONParser.ArraynotemptyContext ctx) {
        return super.visitArraynotempty(ctx);
    }

    @Override
    public String visitArrayempty(JSONParser.ArrayemptyContext ctx) {
        return super.visitArrayempty(ctx);
    }

    @Override
    public String visitElement(JSONParser.ElementContext ctx) {
        return super.visitElement(ctx);
    }

    @Override
    public String visitObjectempty(JSONParser.ObjectemptyContext ctx) {
        return super.visitObjectempty(ctx);
    }

    @Override
    public String visitObjectnotempty(JSONParser.ObjectnotemptyContext ctx) {
        List<JSONParser.PairContext> list = ctx.pair();
        StringBuilder result = new StringBuilder();
        for (JSONParser.PairContext ct : list) {
            result.append(ct.key().STRING().toString());
        }

        return result.toString();
        //return super.visitObjectnotempty(ctx);
    }

    @Override
    public String visitPair(JSONParser.PairContext ctx) {
        return super.visitPair(ctx);
    }

    @Override
    public String visitKey(JSONParser.KeyContext ctx) {
        return super.visitKey(ctx);
    }
}

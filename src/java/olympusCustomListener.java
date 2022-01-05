/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author baton
 */
public class olympusCustomListener extends olympusBaseListener{
    
    private Map<String, Integer> variables;
    public olympusCustomListener() {
        variables = new HashMap<>();
    }
    
    
    
    @Override
    public void exitPrint(olympusParser.PrintContext ctx) {
        
        String output = ctx.IDENTIFIER() == null ? ctx.NUMBER().getText() 
                : variables.get(ctx.IDENTIFIER().getText()).toString();
        System.out.println(output);
    }

}
    


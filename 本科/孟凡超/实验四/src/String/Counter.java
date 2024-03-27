package String;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Counter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine SE = manager.getEngineByName("js");
        String Numbers = new String("Math.sin(30)+2*5-2.33");
        try {
            String ans = SE.eval(Numbers).toString();
            System.out.println(ans);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

}
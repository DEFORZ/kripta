package controllers;

public class MainController {

public Result doAction(String actionNAme, String[] parameters) {
    //action == encode
    //parameters = [text.txt, encode.txt, 12]
    Action action = Actions.find(actionNAme);
    Result result = action.execute(parameters);
    return result;
}

}

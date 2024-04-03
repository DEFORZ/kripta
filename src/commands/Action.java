package commands;



import entite.Result;

public interface Action {
    Result execute(String[] parameters);


}
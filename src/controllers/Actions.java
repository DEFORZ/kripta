package controllers;

public enum Actions {

         ENCODE (new Encoder());
         DECODE (new Decoder());

 private final Action action;

 Actions(Action action) {
     this.action = action;

 }


 public static Action find (String ActionName){
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase( ));
        }
 }
}

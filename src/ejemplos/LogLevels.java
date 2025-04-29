package ejemplos;

public class LogLevels {
    // acuerdese de que si un metodo devuelve algun tipo,
    // lo debe colocar en el metodo
    String levell;

   public String message(String logMsj){
//        String str = logMsj;
//        for(int i = 0; i < logMsj.length(); i++){
//            if(logMsj.charAt(i) == ' '){
//                i++;
//                str = logMsj.substring(i);
//                break;
//            }
//        }
       var test = logMsj.indexOf(" ") + 1;
       int [] primes = { 1, 2, 3, 4 };
       System.out.println(levell);
       return logMsj.substring(test);
    }

    public String logLevel(String level){
        String dv = level.substring(1, level.indexOf("]"));
        return (dv.toLowerCase());
    }

    public String reformat(String logLine){
        var asd = message(logLine); // => operation completed
        String second = logLevel(logLine); // => info
        return String.format("%s (%s)", asd, second);
    }
}

public class Perm {

    // Asuma que todos los parametros son validos
    public static String permutation(String message, int spaces) {
        // Su codigo aqui
        String alfa[] = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String alfabeth = "abcdefghijklmnopqrstuvwxyz";
        
        String fVal="";
        
        for (int i=0; i<message.length(); i++) {
            int index = alfabeth.indexOf(message.substring(i,i+1));
            
            if (spaces+index < 26) {
                fVal += alfa[index+spaces];    
            } else {
                int perm = index+spaces;
                while (perm >= 26) {
                    perm -= 26;
                    if (perm < 26) {
                        fVal += alfa[perm];
                    }
                }
            }
        }
        
        return fVal;
    }   
    
    // NO MODIFICAR A PARTIR DE AQUI

    public static void main(String[] args) {
        if(args.length > 0) {
            String entry = args[0];
            int spaces = Integer.parseInt(args[1]);
            System.out.println(permutation(entry, spaces));
        } else {
            System.err.println("No se paso ningun argumento");
        }
    }
}

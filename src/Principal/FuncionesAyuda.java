
package Principal;



public class FuncionesAyuda {
    
     public static boolean esSegura(String password){
    boolean mayuscula=false;
    boolean numero = false;
    boolean caracterEspecial=false;
    boolean minuscula=false;
    char c;
    int valorASCII;
        for (int i = 0; i < password.length(); i++) {
            c= password.charAt(i);
            valorASCII = (int) c;
                if (valorASCII>=33&&valorASCII<=47||valorASCII>=58&&valorASCII<=64||valorASCII>=91&&valorASCII<=96||valorASCII>=123&&valorASCII<=226) {
                caracterEspecial=true;
                }
                if (Character.isDigit(c)) {
                numero=true;
                }
                if (Character.isUpperCase(c)) { 
                mayuscula=true;
                }
                if (Character.isLowerCase(c)) {
                minuscula=true;
            }
        }if (numero && caracterEspecial && mayuscula && minuscula) {
                return true;
                    }else{
                    return false;
                    }
     }


    



}
    
    
    

    
    
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list01;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class EDList01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*MyList <String>  Lista = new MyList(); //Lista generica de tipo Integer
        Lista.insertFirst("10");
        Lista.showList();
        Lista.insertLast("2000");
        Lista.showList();
        Lista.insertFirst("101");
        Lista.showList();
        Lista.deleteNode("2000");
        Lista.showList();*/
        
        Stack <Character> pila2 = new Stack<>();
        String var;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase o palabra");
        var = teclado.nextLine();
        char[] result = var.replaceAll("[^a-z^A-Z]","").toLowerCase().toCharArray();
        //metodo para eliminar espacios y numeros
        char [] reversed = var.replaceAll("[^a-z^A-Z]","").toLowerCase().toCharArray();
        
        invierteArreglo(reversed,pila2);
        String rev = String.valueOf(reversed);
        String res = String.valueOf(result);
        compareString(rev,res);
    }
    
    public static char[] invierteArreglo(char[] result,Stack<Character> pila2){
        char [] reversed = result;
        for (int i = 0; i < result.length; i++){
            pila2.push(result[i]);
        }
        for (int i = 0; i < result.length; i++) {
            reversed[i]=pila2.pop();
        }
        /*char[] arreglo = new char[res.length];
        for (int i = 0; i<res.length;i++){
        //for(int i = res.length; i>0; i--){
            char letra = p.pop();
            arreglo[i] = letra;
        }
        return arreglo;*/
        return reversed;
    }
    
    public static void showArray(char[] arr){
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    /*
    public static boolean compareArrays(char[] arr1, Stack<Character> st){
        for (int i = 0; i<arr1.length+1;i++){
            char letra = st.pop();
            if ( letra != arr1[i]){
                break;               
            }
            System.out.println("No es Palindromo");
            return false;
        }
        System.out.println("Son iguales");
        return true;
    }
    
    public static boolean compareArrays(char[] arr1, char[] arr2){
        for (int i = 0; i<arr1.length+1;i++){
            if (!(arr1[i] == arr2[i])){
                i = arr1.length+1;
            }
        }
    }
       
    */
    public static void compareString(String n, String r){
        if (n.equals(r)){
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}

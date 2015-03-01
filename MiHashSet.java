
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // arrray que almacena numeros enteros
    private int[] conjunto;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        conjunto = new int[0];    
    }

    /**
     *Metodo que añade el elemento al conjunto si no estaba
     *@param int valor ,el elemento a añadir
     *@return verdadero si el elemento no estaba en el conjunto y falso si ya estaba
     */
    public boolean add(int valor)
    {
        //se comprueba primero si el valor introducido existe ya en la coleccion
        boolean encontrado = true;  //consideramos que no existe el valor en la coleccion
        for(int i = 0; i < conjunto.length; i++) 
        {
            if(valor == conjunto[i])   //si algun valor de la coleccion coincide con el parametro
            {
                encontrado = false;
            }
        }

        if(encontrado)   //si el valor introducido por parametro no existe en la coleccion
        {
            int[] nuevoConjunto = new int[conjunto.length + 1];  //se crea un array temporal con el tamaño del array original aumentado en 1
            nuevoConjunto[nuevoConjunto.length-1] = valor;       //se almacena el valor introducido por parametro en la ultima posicion
            for(int i = 0; i < conjunto.length; i++)
            {
                nuevoConjunto[i] = conjunto[i];
            }
            conjunto = nuevoConjunto; 
        }

        return encontrado;
    }
}

import java.util.HashSet;
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

    /**
     * Metodo que vacia el conjunto
     */
    public void clear()
    {
        conjunto = new int[0];
    }

    /**
     * Metodo para comprobar si el elemento introducido por parametro esta en el conjunto
     * @param int elemento,elemento a comparar
     * @return true si el conjunto ya contiene ese elemento,false si no lo contiene
     */
    public boolean contains(int elemento)
    {
        boolean encontrado = false;       //consideramos que el elemento no esta contenido en el conjunto
        for(int i = 0; i < conjunto.length; i++)
        {
            if(elemento == conjunto[i])   //si un valor del conjunto coincide con el parametro introducido
            {
                encontrado = true;
            }
        }
        return encontrado;
    }

    /**
     * Metodo que elimina del conjunto el elemento pasado por parametro
     * @param int elemento ,es el elemento que se quiere eliminar
     * @return true si el elemento existia en el conjunto,false si no existia
     */
    public boolean remove(int elemento)
    {
        //primero se comprueba si el elemento que se quiere eliminar existe en el conjunto
        boolean existe = false;   //partimos de que no existe el elemento en el conjunto
        for(int i = 0; i < conjunto.length; i++)
        {
            if(elemento == conjunto[i])   //si el elemento coincide con algun valor del conjunto
            {
                existe = true;
            }
        }
        if(existe)   //si el elemento a borrar si existe en el conjunto
        {
            int[] nuevoConjunto = new int[conjunto.length - 1]; //se crea un array temporal con un tamaño igual al original pero reducido en 1
            for(int i = 0; i < conjunto.length - 1; i++)
            {
                nuevoConjunto[i] = conjunto[i];
                if(elemento == conjunto[i])   //si el parametro introducido coincide con un valor del conjunto
                {
                    nuevoConjunto[i] = conjunto[i + 1];  //en la posicion correspondiente almacenamos el valor siguiente al del parametro
                    //del array original
                }

            }
            conjunto = nuevoConjunto;
        }
        return existe;
    }

    /**
     * Metodo que comprueba si el conjunto esta vacio
     * @return true si el conjunto esta vacio
     */
    public boolean isEmpty()
    {
        boolean vacio = false;   //se considera que el conjunto no esta vacio
        if(conjunto.length == 0)
        {
            vacio = true;
        }
        return vacio;
    }

    /**
     * Metodo que devuelve el numero de elementos del conjunto
     */
    public int size()
    {
        return conjunto.length;
    }

    /**
     * Metodo que devuelve una cadena conteniendo todos los elementos del conjunto 
     * separados por comas y entre corchetes.
     */
    public String toString()
    {
        String cadena = "";
        if(conjunto.length !=0)
        {
            cadena = "[" + conjunto[0]; 
        }
        for(int i = 1; i < conjunto.length; i++)
        {
            cadena += "," + conjunto[i];
        }
        cadena += "]";
        return cadena;
    }

    /**
     * Metodo que  devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca
     * y falso en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean iguales = true;  //consideramos que ambos conjuntos son iguales
        if(conjunto.length == otroConjunto.size())   //primero se comprueba si ambos conjuntos tienen el mismo tamaño
        {
            for(int i = 0; i < conjunto.length; i++)
            {
                if(otroConjunto.get(i) != conjunto[i])
                {
                    iguales = false;
                }
            }
        }
        else
        {
            iguales = false;
        }
        return iguales;
    }
    
    /**
     * 
     */
    public int get(int indice)
    {
        return conjunto[indice];
    }
}

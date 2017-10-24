import java.lang.reflect.Array;

/**
 * Created by SEFTA on 19/10/2017.
 */

public class VectorHelper {
    /**
    * */
    private int [] vector ;
    private int size;
    /**
     * VectorHelper est le constructeur de la classe VectorHelper,
     * il prend en paramètres : un pointeur vers un vecteur "vector" et le taille du vecteur "size".
     */
    public VectorHelper(int[] vector, int size) {
        this.vector = vector;
        this.size = size;
    }
    /**
     *
     */

    public int [] sortV (){
        int [] tmpV = new int[size];
        int tmp ;
        boolean bool = false;
        tmpV=vector;
        while (!bool){
            for (int i=0 ;i<size;i++)
            {
                if(tmpV[i]>tmpV[i+1]){
                    tmp = tmpV[i];
                    tmpV[i] = tmpV[i+1];
                    tmpV[i+1] = tmp;

                }
                else {
                    bool = true;
                }
            }
        }
        return tmpV;
    }
}
 public int [] sommeVectors (int [] vecteur, int size)
{	
    int [] tmp = new int [this.size];
    if (size != this.size) throw new DiffrentSizeException (){
        for (int i = 0,i<this.size;i++){
            tmp [i] = this.vector[i] + vecteur[i];
        }
    }
    return tmp;

}
public int [] InversingV ()
{
    int [] tmp = new int [this.size];
    int j = 0;
    for (int i = this.size-1;i>=0;i++)
    {
        tmp [j] = this.vector[size];
        j++;
    }
    return tmp;
}
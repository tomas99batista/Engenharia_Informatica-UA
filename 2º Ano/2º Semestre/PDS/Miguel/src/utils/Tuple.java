package utils;

public class Tuple<T, K>
{
    // Implementação simples de um Tuplo (mas mutável), a la Python
    private T x;
    private K y;
    public Tuple(T first, K second){
        this.x = first;
        this.y = second;
    }
    public T getFirst()
    {
        return x;
    }
    public K getSecond()
    {
        return y;
    }
    
    @Override
    public String toString(){
        return "(" + x.toString() + ", " + y.toString() + ")";
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((x == null) ? 0 : x.hashCode());
        result = prime * result + ((y == null) ? 0 : y.hashCode());
        return result;
    }
    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tuple<T, K> other = (Tuple<T, K>) obj;
        if (x == null)
        {
            if (other.x != null)
                return false;
        }
        else if (!x.equals(other.x))
            return false;
        if (y == null)
        {
            if (other.y != null)
                return false;
        }
        else if (!y.equals(other.y))
            return false;
        return true;
    }
    
    

}

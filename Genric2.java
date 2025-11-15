class Data<T>
{
private T obj;

public void setData(T v)
{

obj=v;

}

public T getData()

{

    return obj;

}
}
public class Genric2 {

    public static void main(String[] args) {
        
       // Data<String> d=new Data(); d.setData("Hi");
        @SuppressWarnings("rawtypes")
        Data<Integer> d=new Data(); d.setData(10);

System.out.println(d.getData());

    }
}
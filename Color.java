public abstract class Color implements Cloneable{
    protected String colorname;
    
    abstract void addColor();

    public Object clone()
    {
        Object clone = null;
        try{
            clone = super.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}

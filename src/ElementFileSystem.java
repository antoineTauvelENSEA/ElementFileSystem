public abstract class ElementFileSystem {
    protected String name;
    protected Directory parentDirectory;

    public ElementFileSystem(String name, Directory parentDirectory) {
        this.name = name;
        this.parentDirectory = parentDirectory;
        if (parentDirectory!=null) parentDirectory.addElementFileSystem(this);

    }

    public abstract int getSize();

    public String getPath(){
        String s="";
        ElementFileSystem current = this;
        while(current != null){
            s=current.name+"\\"+s;
            current=current.parentDirectory;
        }
        return s;
    }

    public void setParentDirectory(Directory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }
}

import java.util.LinkedList;

public class Directory extends ElementFileSystem{
    LinkedList<ElementFileSystem> listOfElement = new LinkedList<>();

    public Directory(String name, Directory parentDirectory) {
        super(name, parentDirectory);
    }

    @Override
    public int getSize() {
        int size = 0;
        for (ElementFileSystem e : listOfElement) size = size+e.getSize();
        return size;
    }

    @Override
    public String toString(){
        String s=name+"\n";
        for (ElementFileSystem e : listOfElement){
            s=s+"\t"+e.toString()+"\n";
        }
        return s;
    }

    public void addElementFileSystem(ElementFileSystem e){
        e.setParentDirectory(this);
        this.listOfElement.add(e);
    }
}

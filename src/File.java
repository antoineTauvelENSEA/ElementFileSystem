public class File extends ElementFileSystem{
    protected int size;

    public File(String name, Directory parentDirectory, int size) {
        super(name, parentDirectory);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString(){
        return (name+"\t"+size);
    }
}

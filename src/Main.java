public class Main {

    public static void main(String[] args) {
	// write your code here
        Directory d1 = new Directory("",null);
        Directory d2 = new Directory ("MyDir",d1);
        Directory d3 = new Directory ("MyOtherDir",d1);

        File f1 = new File("exemple1.txt",d2,200);
        File f2 = new File("exemple2.txt",d2,250);
        File f3 = new File("exemple3.txt",d3,1000);

        System.out.println(f1.getPath());
        System.out.println(d2.getSize());
        System.out.println(d1.getSize());
        System.out.println(d1);

    }
}

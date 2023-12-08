import java.io.File;

public class Fileinfo {
    public static void main(String[] args) {
        File myObj = new File("prince.txt");
        System.out.println("File name : " + myObj.getName());
        System.out.println("File Path : " + myObj.getAbsolutePath());
        System.out.println("File Exists : " + myObj.exists());
        System.out.println(myObj.isDirectory());
        System.out.println("Readable : " + myObj.canRead());
        System.out.println("Writeable : " + myObj.canWrite());
        System.out.println("File character length : " + myObj.length());
        System.out.println("File modification : " + myObj.lastModified());
    }

}

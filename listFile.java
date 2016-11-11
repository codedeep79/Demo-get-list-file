package javaapplication7;
 
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
 
/**
 * @author Crunchify.com
 */
 
public class listFile {
    public static List<String> fileList(String directory) {
        List<String> fileNames = new ArrayList<>();
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directory))) {
                for (Path path : directoryStream) {
                    fileNames.add(path.toString());
                }
            } catch (IOException ex) {}
            return fileNames;
        }
    public static void main(String[] args) {
        for (int i = 0;i < fileList("D:/").size(); ++i)
            System.out.println(fileList("D:/").get(i));   
    }
}
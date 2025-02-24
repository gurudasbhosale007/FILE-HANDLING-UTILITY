import java.io.*;
public class FileHandlingUtility
{
    public static void main(String[] args)
 {
   String filename="task1.txt";
   writeToFile(filename,"Hello,It is First Task Of Codetech!");
   readFromFile(filename);
   modifyFile(filename,"\n Modified text: Hello, I Am Gurudas!");
   readFromFile(filename);     
 }
 public static void writeToFile(String filename,String content)
 {
    try(BufferedWriter wr=new BufferedWriter (new FileWriter(filename)))
    {
        wr.write(content);
        System.out.println("File Written Successfilly!");
    }
    catch(IOException e)
    {
        System.out.println("Error to Write file:"+e.getMessage());
    }
 }
 public static void readFromFile(String filename)
 {
    try(BufferedReader r=new BufferedReader(new FileReader(filename)))
 {
    System.out.println("\n Reading file content:");
    String line;
    while((line=r.readLine())!=null)
{
    System.err.println(line);
}
} catch (IOException e) 
 {
    System.err.println("Error to read file"+e.getMessage());
 }
 }
 public static void modifyFile(String filename,String newContent)
 {
    try(BufferedWriter w=new BufferedWriter(new FileWriter(filename,true)))
    {
        w.write(newContent);
        System.out.println("\n File Modified Successfully!");
    }
    catch(IOException e)
    {
        System.out.println("Error during modifying"+e.getMessage());
    }
 }
}

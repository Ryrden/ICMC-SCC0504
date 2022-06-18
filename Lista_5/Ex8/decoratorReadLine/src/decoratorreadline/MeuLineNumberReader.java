package decoratorreadline;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ryan.souza
 */
public class MeuLineNumberReader extends LineReader{
    RandomAccessFile file;
    public MeuLineNumberReader(RandomAccessFile file) {
        this.file = file;
    }

    public String readLine(){
        String line = null;
        try{
            line = file.readLine();
        }catch(IOException e){
            System.out.println("Error! " + e);
            return null;
        }finally{
            return line;   
        }
    }
}

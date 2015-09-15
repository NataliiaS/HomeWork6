package sourseit.HomeWork.Sydorenko.HomeWork6;


import java.io.IOException;

public class FilesReader implements Runnable
{
    ReadAndWrite raw2 = new ReadAndWrite();
    @Override
    public void run()
    {
        try
        {
            raw2.readFiles();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

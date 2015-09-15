package sourseit.HomeWork.Sydorenko.HomeWork6;

import java.io.IOException;

public class FilesWriter implements Runnable
{

    ReadAndWrite raw1 = new ReadAndWrite();

    @Override
    public void run()
    {
        try
        {
            raw1.writeFiles();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}

package sourseit.HomeWork.Sydorenko.HomeWork6;

import java.io.*;

public class ReadAndWrite
{
    String [] fileNames = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String fileName;
    String dirName = "C:\\Users\\Natasha\\Desktop\\JAVA\\";

    public void writeFiles() throws IOException
    {
        new File(dirName + fileName + ".txt");
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(dirName + fileName + ".txt"));

            for (int a = 0; a<100; a++){
                for (int b = 0; b<100; b++){
                    bw.write(fileName);
                }
                bw.write("\r\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            bw.close();
        }
    }


    public void readFiles()
            throws IOException
    {
        BufferedReader br = null;
        BufferedWriter bw = null;

        br = new BufferedReader(new FileReader(dirName + fileName + ".txt"));
        bw = new BufferedWriter(new FileWriter(dirName + "super.txt", true));
        String str;
        try
        {
            while ((str = br.readLine()) != null)
            {
                bw.append(str);
                bw.append("\r\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        br.close();
        bw.close();
    }
}

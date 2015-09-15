package sourseit.HomeWork.Sydorenko.HomeWork6;


import java.io.IOException;

import static java.lang.Integer.parseInt;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        FilesWriter fw = new FilesWriter();

        Thread tw[] = new Thread[90];
        for (int i = 0; i < tw.length; i++)
        {
            tw[i] = new Thread(fw,
                    "Thread " + (i+1));
        }
        int a = 0;
        for (int i = 0; i < tw.length; i++)
        {
            if (i!=0 && i%10==0){
                a++;
            }
            fw.raw1.fileName = fw.raw1.fileNames[a];

            tw[i].start();
            System.out.println(tw[i].getName() +
                    " started");
        }


            Thread tr[] = new Thread[180];
            FilesReader fr = new FilesReader();
            for (int i = 0; i < tr.length; i++)
            {
                tr[i] = new Thread(fr,
                        "Thread " + (i+1));
            }
            int b = 0;
            for (int i = 0; i < tr.length; i++)
            {
                if (i!=0 && i%20==0){
                    b++;
                }
                fr.raw2.fileName = fr.raw2.fileNames[b];
                tr[i].start();
                System.out.println(tr[i].getName() +
                        " started");
            }
        }


}


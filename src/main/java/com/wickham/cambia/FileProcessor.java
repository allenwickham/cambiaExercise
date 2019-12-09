package com.wickham.cambia;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileProcessor
{
    public static void main(String args[])
    {
        String outputFileName = "output.csv";

        if (args.length > 0)
        {
            try
            {
                final BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]));
                final Scanner inputTokenizer = new Scanner(inputStream);

                inputTokenizer.useDelimiter(",");

                List<String> tokenizedStrings = new ArrayList<>();

                while (inputTokenizer.hasNext())
                {
                    tokenizedStrings.add(inputTokenizer.next().trim());
                }

                Collections.sort(tokenizedStrings, Collections.reverseOrder());

                final PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFileName)));

                int numberOfStrings = tokenizedStrings.size();
                int currentString = 1;

                for (String sortedString:tokenizedStrings)
                {
                    writer.print(sortedString);

                    if (numberOfStrings != currentString)
                    {
                        writer.print(",");
                    }

                    currentString++;
                }

                writer.close();

                inputTokenizer.close();
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            // TODO: return a usage example
        }
    }
}

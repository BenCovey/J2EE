using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LogLib
{
    /// <summary>
    /// Logging Class
    /// </summary>

    public class Logging
    {
        /// <summary>
        /// Write file, writing to log files
        /// </summary>
        /// <param name="inputFile"></param>
        /// <param name="Data"></param>
        public void WriteFile(string inputFile, String Data)
        {
            try
            { 
                if(File.Exists(inputFile)){
                    //If file exists, open and write data to file.
                    System.IO.StreamWriter file = new System.IO.StreamWriter(inputFile, true);
                    file.WriteLine(Data);
                    file.Close();
                }else{//end if
                    //If file does not exist create new file for writing
                    System.IO.StreamWriter file = new System.IO.StreamWriter(inputFile);
                    file.WriteLine(Data);
                    file.Close();
                }//end else
            }//end try
            catch(IOException err)
            {
                //TODO
                //Testing, remove for finished assignment
                Console.Write(err);
            }//end catch
        }//end writefile
    }//end logging
}//end main
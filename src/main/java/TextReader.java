import java.io.*;

public class TextReader {

    public String[] read(){
        String[] strs = new String[10000];
        try {
            // read file content from file
            StringBuffer sb = new StringBuffer("");

            FileReader reader = new FileReader("C:\\Users\\P52\\Documents\\test.txt");
            BufferedReader br = new BufferedReader(reader);

            String str = null;
            int sum = 0;
            while ((str = br.readLine()) != null) {
                sb.append(str + "\r\n");
                strs[sum] = str;
                sum++;
                //System.out.println(str);
            }
            System.out.println("Total:"+sum);
            br.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strs;
    }
    public static void main(String[] args) {

    }
    }

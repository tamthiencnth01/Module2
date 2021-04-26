import java.io.*;

public class LyThuyet {
    public static void main(String[] args) {
       // int[] arr = {2,3,5,7,11};
        try{


//            File inFile = new File("hello.txt");
//            FileReader fileReader = new FileReader(inFile);
//            BufferedReader reader = new BufferedReader(fileReader);
//            String line =null;
//            while ((line= reader.readLine())!=null){
//                System.out.println(line);
//            }
//            reader.close();


//            FileWriter writer = new FileWriter("Hello.txt");
//            writer.write("thien");
//            writer.close();



//            String toSplit = "50,Zombie,teeth.hands";
//            String[] result = toSplit.split(",");
//            for (String token:
//                 result) {
//                System.out.println(token);
//            }
        FileInputStream fin = new FileInputStream(args[0]);
        DataInputStream din = new DataInputStream(fin);
        while (true){
            System.out.println(din.readInt());
        }

//        FileOutputStream fout = new FileOutputStream(args[0]);
//        DataOutputStream dout = new DataOutputStream(fout);
//            for (int i = 0; i < arr.length; i++) {
//                dout.writeInt(arr[i]);
//            }
//            dout.close();
        }
        catch (EOFException e){
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

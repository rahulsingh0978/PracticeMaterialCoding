package Match.binarysupporter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BinarySupporter{
	private static final String FilenameInput="D:\\Test\\BinSupport\\input.txt";
	private static final String FilenameOutput="D:\\Test\\BinSupport\\output.txt";
	static int binaryDigitsCount(int n){
		int count = 0;
		int temp = n;
		while(temp!=0){
			temp = temp/2;
			count++;
		}
		return count;
	}
	static boolean contains(int ar[] , int n){
		if(ar.length==0)
			return false;
		for(int i=0;i<ar.length;i++){
			if(ar[i]==n)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		Scanner sr = null;
		try{
			fr = new FileReader(FilenameInput);
			br = new BufferedReader(fr);
			sr = new Scanner(fr);
			
			
			fw = new FileWriter(FilenameOutput);
			bw = new BufferedWriter(fw);
			//System.out.println("file size"+br.);
			//String currentLine;
			int count=0;
			int ar[] = new int[100];
			while(sr.hasNextInt()){
				ar[count++]=sr.nextInt();
			}
			
			/*while((currentLine = br.readLine())!=null){
				System.out.print(currentLine);
				
				bw.write(currentLine);
				try{
					ar[count++]=Integer.parseInt(currentLine);
				}
				catch (NumberFormatException ex) {
					  continue;
					}
			}*/
			
			
			
		}
		catch(IOException ex){
			System.out.println("messege"+ex);
		}
		finally{
			
			try{
				if(br != null){
					br.close();
				}
				if(fr != null)
					fr.close();
				if(bw!=null)
					bw.close();
				if(fr!=null)
					fr.close();
			}
			catch(IOException ex){
				System.out.println("msg" + ex);
			}
		}
	}
}
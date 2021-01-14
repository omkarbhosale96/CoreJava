package sortArrayOfString;

public class MyString {

	public static void main(String[] args) {
	 String a="Omkar is my name a";
	 
	 String b[]=a.split(" ");
	 
	 for(int i=0;i<b.length;i++)
	 {
		 for(int j=i+1;j<b.length;j++)
		 {
			 if(b[i].length()>b[j].length())
			 {
				 String temp=b[i];
				 b[i]=b[j];
				 b[j]=temp;
			 }
		 }
	 }
	 for(String p:b)
		 System.out.print(p+" ");

	}

}

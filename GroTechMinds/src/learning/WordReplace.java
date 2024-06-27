package learning;

public class WordReplace {

	public static void main(String[] args) {
		String a="onkar9020992kirti";
		char[]c=a.toCharArray();
		StringBuffer sb= new StringBuffer();
		for(int i=0; i<c.length; i++)
		{
			if(Character.isDigit(c[i]))
			{
				i++;
			}
			else
			{
				sb.append(c[i]);
			}
		}
		System.out.println(sb);

	}

}

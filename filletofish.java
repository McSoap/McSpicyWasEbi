
public class Hello {
    public static int findMax ( int px, int py )
    {
        return px >= py ? px : py;
    }

	public static void main(String[] args){
		int num=0;
		for(int i=0;i<10000000;i++){
			num++;
			System.out.println(num);
		}
	}
}

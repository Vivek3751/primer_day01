//7.The plus pattern has the shape of the mathematical plus sign (+)

public class PlusPattern {
    public static void main(String[] args) {
        int size=5;
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
            {
                if(i==(size/2)+1 || j==(size/2)+1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}

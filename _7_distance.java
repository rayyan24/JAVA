import java.util.Scanner;
class _7_distance
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String cityName[]={"Delhi","UP","MP","Kashmir","Assam"};        
        int distance[]={200,400,600,800,1000};
        String search;
        System.out.print("Enter A City Name: ");
        search=input.next();
        int i=0;
        for (String word : cityName) {

            if (word.equals(search)) {
                System.out.println("Distance(Miles)= "+distance[i]);
            }
            i++;
        }
        input.close();
    }
}
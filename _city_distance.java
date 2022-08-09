import java.util.Scanner;
class _city_distance
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String cityName[]={"Delhi","UP","MP","Kashmir","Assam"};        
        int distance[]={2,4,6,8,10};
        String search;
        System.out.print("Enter A City Name: ");
        search=input.next();
        int i=0;
        for (String word : cityName) {

            if (word.equals(search)) {
                System.out.println("Distance= "+distance[i]);
            }
            i++;
        }
        input.close();
    }
}
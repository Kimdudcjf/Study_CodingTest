public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * 올 골드 럭비 클럽의 회원들은 성인부 또는 청소년부로 분류된다.
         * 나이가 17세보다 많거나, 몸무게가 80kg 이상이면 성인부이다. 그 밖에는 모두 청소년부이다. 클럽 회원들을 올바르게 분류하라.
         * */

        Scanner sc = new Scanner(System.in);

        while(true) {
            String str =  sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();

            if((str.equals("#")) && (age==0)&&(weight==0)){
                break;
            }

            if((age > 17) || (weight >=80)) {
                System.out.println(str+" "+"Senior");
            }
            else
                System.out.println(str+" "+"Junior");

        }

    }

}

public class Main {
    public static void main(String[] args) {
        Legal[] legal = new Legal[3];
        legal[0] = new Legal("Diyaz","1",25);
        legal[1] = new Legal("Abduvali","2",25);
        legal[2] = new Legal("Aibek","3",25);
        for (int i = 0; i < legal.length; i++) {
            System.out.println(legal[i]);
        }
        Technical[] technical = new Technical[3];
        technical[0] = new Technical("Aktan","4",25);
        technical[1] = new Technical("Kiyal","5",25);
        technical[2] = new Technical("Baike","6",25);
        for (int i = 0; i < legal.length; i++) {
            System.out.println(technical[i]);
        }

    }
}

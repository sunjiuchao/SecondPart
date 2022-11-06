package Study.UpFileUUID;

import java.util.UUID;

public class UUid {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString().replace("-","");
        System.out.println(s);
    }
}

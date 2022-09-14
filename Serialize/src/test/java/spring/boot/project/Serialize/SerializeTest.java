package spring.boot.project.Serialize;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Base64;

public class SerializeTest {

    @Test
    void test() throws IOException {
        Member member = new Member("현인", "honghyunin", 1L, new Etc(), new Something());

        byte[] serializeMember;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(member);

        serializeMember = baos.toByteArray();
        System.out.println("SerializeMember : " + Base64.getEncoder().encodeToString(serializeMember));
    }

    @Test
    void reverseSerializeMember() throws IOException, ClassNotFoundException {
        String base64Member = "rO0ABXNyABpzcHJpbmcuYm9vdC5wcm9qZWN0Lk1lbWJlckomyRhVzmvFAgADTAACaWR0ABJMamF2YS9sYW5nL1N0cmluZztMAANpZHh0ABBMamF2YS9sYW5nL0xvbmc7TAAEbmFtZXEAfgABeHB0AApob25naHl1bmluc3IADmphdmEubGFuZy5Mb25nO4vkkMyPI98CAAFKAAV2YWx1ZXhyABBqYXZhLmxhbmcuTnVtYmVyhqyVHQuU4IsCAAB4cAAAAAAAAAABdAAG7ZiE7J24";

        byte[] serializeMemberByte = Base64.getDecoder().decode(base64Member);

        ByteArrayInputStream bais = new ByteArrayInputStream(serializeMemberByte);
        ObjectInputStream ois = new ObjectInputStream(bais);

        Object objectMember = ois.readObject();
        Member member = (Member) objectMember;
        System.out.println("Member : " + member);
    }
}

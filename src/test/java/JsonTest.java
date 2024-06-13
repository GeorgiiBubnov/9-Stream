import com.fasterxml.jackson.databind.ObjectMapper;
import model.JsonFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;


public class JsonTest {
    private ClassLoader cl = JsonTest.class.getClassLoader();

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void checkJsonFileTest() throws Exception {
        try (InputStream is = cl.getResourceAsStream("JsonFile.json")) {
            assert is != null;
            try (InputStreamReader isr = new InputStreamReader(is)) {
                JsonFile data;
                data = objectMapper.readValue(isr, JsonFile.class);
                Assertions.assertEquals("Super hero squad", data.getSquadName());
                Assertions.assertEquals("Metro City", data.getHomeTown());
                Assertions.assertEquals(2016, data.getFormed());
                Assertions.assertEquals("Super tower", data.getSecretBase());
                Assertions.assertEquals(true, data.isActive());
                Assertions.assertEquals(List.of("Molecule Man",
                        "Madame Uppercut",
                        "Eternal Flame"), data.getMembers());


            }
        }
    }
}
package com.nzed.gentrack.mydemoproject.domain.animal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FishTest{
    @Test
    public void noiseTest() {
        Fish fish = new Fish();
        assertEquals(fish.getNoise(), "blurp");
    }
}

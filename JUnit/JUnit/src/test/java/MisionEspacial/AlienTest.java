package MisionEspacial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienTest {

    @Test
    void constructorGuardaElNombre() {
        Alien alien = new Alien("Zorg", "MARS01");

        assertEquals("Zorg", alien.getName());
    }

    @Test
    void constructorGuardaElPlaneta() {
        Alien alien = new Alien("Zorg", "MARS01");

        assertEquals("MARS01", alien.getPlanetId());
    }

    @Test
    void metodoToStringDevuelveTextoCorrecto() {
        Alien alien = new Alien("Zorg", "MARS01");

        assertEquals("Zorg MARS01", alien.toString());
    }

    @Test
    void dosAliensDelMismoPlanetaSonIguales() {
        Alien alien1 = new Alien("Zorg", "MARS01");
        Alien alien2 = new Alien("Xenomorph", "MARS01");

        assertTrue(alien1.equals(alien2));
    }

    @Test
    void aliensDePlanetasDistintosNoSonIguales() {
        Alien alien1 = new Alien("Zorg", "MARS01");
        Alien alien2 = new Alien("Xenomorph", "LV426");

        assertFalse(alien1.equals(alien2));
    }

    @Test
    void cambiarNombreFuncionaCorrectamente() {
        Alien alien = new Alien("Zorg", "MARS01");

        alien.setName("Xenomorph");

        assertEquals("Xenomorph", alien.getName());
    }

    @Test
    void cambiarPlanetaFuncionaCorrectamente() {
        Alien alien = new Alien("Zorg", "MARS01");

        alien.setPlanetId("LV426");

        assertEquals("LV426", alien.getPlanetId());
    }

    @Test
    void elObjetoAlienNoEsNulo() {
        Alien alien = new Alien("Zorg", "MARS01");

        assertNotNull(alien);
    }
}
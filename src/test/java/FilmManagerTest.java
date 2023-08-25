import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void emptyTest() {
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmTest() {
        FilmManager manager = new FilmManager();
        manager.add("Игра Престолов");
        String[] expected = {"Игра Престолов"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoreFilmsTest() {
        FilmManager manager = new FilmManager();
        manager.add("Игра Престолов");
        manager.add("Жить");
        manager.add("Boom");
        manager.add("Кот");
        manager.add("Разум");
        String[] expected = {"Игра Престолов", "Жить", "Разум", "Boom", "Кот", "Разум"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sameFilmsTest() {
        FilmManager manager2 = new FilmManager();
        manager2.add("Мама");
        manager2.add("Мама");
        String[] expected = {"Мама", "Мама"};
        String[] actual = manager2.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}

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
        String[] expected = {"Игра Престолов", "Жить", "Boom", "Кот", "Разум"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sameFilmsTest() {
        FilmManager manager = new FilmManager();
        manager.add("Мама");
        manager.add("Мама");
        String[] expected = {"Мама", "Мама"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addReverseFilmsTest() {
        FilmManager manager = new FilmManager();
        manager.add("Мама");
        manager.add("Метро");
        String[] expected = {"Метро", "Мама"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoreLimitFilmsTest() {
        FilmManager manager = new FilmManager();
        manager.add("Ого");
        manager.add("Игра Престолов");
        manager.add("Жить");
        manager.add("Boom");
        manager.add("Кот");
        manager.add("Разум");
        String[] expected = {"Разум", "Кот", "Boom", "Жить", "Игра Престолов"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void limitFilmTest() {
        FilmManager manager = new FilmManager(7);
        manager.add("Хатико");
        manager.add("Ого");
        manager.add("Игра Престолов");
        manager.add("Жить");
        manager.add("Boom");
        manager.add("Кот");
        manager.add("Разум");
        String[] expected = {"Разум", "Кот", "Boom", "Жить", "Игра Престолов", "Ого", "Хатико"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
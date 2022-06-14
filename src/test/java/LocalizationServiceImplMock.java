import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplMock {
    @Test
    void test_location_by_ip_mockito() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String expected = localizationService.locale(Country.RUSSIA);
        String actual = "Добро пожаловать";
        Assertions.assertEquals(expected, actual);
    }
}

import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.sender.MessageSenderImpl;

class GeoServiceImplMock {
    @Test
    void test_location_by_ip_mockito() {
        GeoService geoService = new GeoServiceImpl();
        Location location = geoService.byIp("172.0.0.0");
        String expected = location.getCity();
        String actual = "Moscow";
        Assertions.assertEquals(expected, actual);
    }
}

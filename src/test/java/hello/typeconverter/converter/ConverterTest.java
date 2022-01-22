package hello.typeconverter.converter;


import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {
    @Test
    void StringToIntger() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void IntegerToString() {
        IntegerToStringConverter co = new IntegerToStringConverter();
        String result = co.convert(10);
        Assertions.assertThat(result).isEqualTo("10");
    }

    @Test
    void StringToIpPort() {
        StringToIpPortConverter converter = new StringToIpPortConverter();
        IpPort convert = converter.convert("127.0.0.1:8080");
        Assertions.assertThat(convert).isEqualTo(new IpPort("127.0.0.1",8080));

    }

    @Test
    void IpPortToString() {
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort ipPort = new IpPort("127.0.0.2", 8080);
        String result = converter.convert(ipPort);
        Assertions.assertThat(result).isEqualTo("127.0.0.2:8080");
    }
}

// Interfejs do opisu kodów ICD-10
public interface ICDCodeTabular {
    String getDescription(String code) throws IndexOutOfBoundsException;
}
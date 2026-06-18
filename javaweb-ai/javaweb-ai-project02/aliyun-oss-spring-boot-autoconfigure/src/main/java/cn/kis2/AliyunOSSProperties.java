package cn.kis2;
import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.Objects;


@ConfigurationProperties(prefix = "aliyun.oss")
public class AliyunOSSProperties {
    private String endpoint;
    private String bucketName;
    private String region;

    public AliyunOSSProperties(String endpoint, String bucketName, String region) {
        this.endpoint = endpoint;
        this.bucketName = bucketName;
        this.region = region;
    }

    public AliyunOSSProperties() {
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        AliyunOSSProperties that = (AliyunOSSProperties) o;
        return Objects.equals(endpoint, that.endpoint) && Objects.equals(bucketName, that.bucketName) && Objects.equals(region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, bucketName, region);
    }

    @Override
    public String toString() {
        return "AliyunOSSProperties{" +
                "endpoint='" + endpoint + '\'' +
                ", bucketName='" + bucketName + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}

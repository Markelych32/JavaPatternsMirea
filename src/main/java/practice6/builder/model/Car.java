package practice6.builder.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public boolean doQualityCheck() {
        return (chassis != null && !chassis.trim().isEmpty()) && (body != null && !body.trim().isEmpty()) &&
               (paint != null && !paint.trim().isEmpty()) && (interior != null && !interior.trim().isEmpty());
    }

    @Override
    public String toString() {
        return "Car [chassis=" + chassis + ", body=" + body + ", paint=" + paint;
    }
}

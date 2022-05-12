package bonus.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CityJDBC {
    private int id;
    private String name;
    private int countryId;
    private int population;
}

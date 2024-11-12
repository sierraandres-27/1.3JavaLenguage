package Exercise_1_Nivel_1.Models;

import java.util.Objects;

public class Month {

    private String name;

    public Month(String name_p){

        name=name_p;


    }

    public String Dame_nombre(){

        return name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

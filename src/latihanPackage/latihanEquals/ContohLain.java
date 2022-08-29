package src.latihanPackage.latihanEquals;

import java.util.Objects;

public class ContohLain {
    public String name;
    public int umur;
    public ContohLain(String name,int umur){
        this.name = name;
        this.umur = umur;
    }

    public String toString(){
        return "nama saya "+name+" umur saya "+umur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContohLain that = (ContohLain) o;
        return umur == that.umur && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, umur);
    }

}

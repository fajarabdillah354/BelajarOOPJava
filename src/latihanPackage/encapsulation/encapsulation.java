package src.latihanPackage.encapsulation;

public class encapsulation {
    String name;
    int price;
/*
* semakin banyak field yang kita buat maka akan semakin banyak juga GETTER DAN SETTER yang akan di buat
 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "aerox"){//jika name = aerox maka akses akan di tolak
            System.out.println("akses di tolak");
        }else {
            this.name = name;
        }

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

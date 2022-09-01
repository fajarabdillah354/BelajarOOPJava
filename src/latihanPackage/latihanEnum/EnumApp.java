package src.latihanPackage.latihanEnum;

public class EnumApp {
    public static void main(String[] args) {
        AkseEnum player = new AkseEnum();
        System.out.println("=== tingkatan level yang ada ===");
        /*
        akses enum
         */
        player.setLevel(Level.HARD);
        player.setPlayer("fajar");
        /*
        akses getter setter
         */
        System.out.println(player.getPlayer());
        System.out.print(player.getLevel().getTingkatan()+" : ");//getTingkatan()adalah cons
        System.out.println(player.getLevel());

        /*
        mengkonversi ENUM
         */
        //DARI Enum menjadi String
        String enumString = Level.MEDIUM.name();
        //DARI String menjadi Enum
        Level level = Level.valueOf("EASY");
        //melihat isi enum
        System.out.println("isi tingkatan");
        for (var value:Level.values()) {
            System.out.println(value);
        }
    }
}

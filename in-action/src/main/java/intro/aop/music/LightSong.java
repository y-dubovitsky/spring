package intro.aop.music;

public class LightSong implements Song {

    @Override
    public void sing() {
        System.out.println("Ничего на свете лучше нету,\n" +
                "Чем бродить друзьям по белу свету.\n" +
                "Тем, кто дружен, не страшны тревоги\n" +
                "Нам любые дороги дороги.\n" +
                "Нам любые дороги дороги.\n" +
                "\n" +
                "Припев.\n" +
                "\n" +
                "Наш ковёр - цветочная поляна,\n" +
                "Наши стены - сосны-великаны,\n" +
                "Наша крыша - небо голубое\n" +
                "Наше счастье - жить одной судьбою.\n" +
                "\n" +
                "Припев.\n" +
                "\n" +
                "Мы своё призванье не забудем -\n" +
                "Смех и радость мы приносим людям.\n" +
                "Нам дворцов заманчивые своды\n" +
                "Не заменят никогда свободы.\n" +
                "\n" +
                "Припев.");
    }
}
